package org.mcj.dsl.debugger.model;

import java.util.ArrayList;

import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IMemoryBlock;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.debug.core.IJavaDebugTarget;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.mcj.dsl.debugger.DSLDebuggerConstants;
import org.mcj.dsl.debugger.breakpoints.DSLLineBreakpoint;
import org.mcj.dsl.debugger.traceability.SimpleMapping;
import org.mcj.dsl.debugger.traceability.TraceabilityModelHelper;

public class DSLDebugTarget extends PlatformObject implements IDebugTarget, IDebugEventSetListener {

	private ILaunch launch;

	private TraceabilityModel traceabilityModel;

	private EObject dslProgramModel;

	private ArrayList<DSLThread> dslThreads;

	private IProcess process;

	private ArrayList<DSLLineBreakpoint> dslLineBreakpoints;
	
	private IJavaDebugTarget javaDebugTarget;

	public DSLDebugTarget(ILaunch launch, TraceabilityModel traceabilityModel, EObject dslProgramModel) {
		this.launch = launch;
		this.traceabilityModel = traceabilityModel;
		this.dslProgramModel = dslProgramModel;

		initialize();

		DebugPlugin.getDefault().addDebugEventListener(this);

	}

	private void initialize() {
		initBreakpoints();
		initThreads();
	}

	private void deinitialize() {
		deinitBreakpoints();
		deinitThreads();
	}
	
	private IBreakpointManager getBreakpointManager() {
		return DebugPlugin.getDefault().getBreakpointManager();
	}

	private void initBreakpoints() {
		dslLineBreakpoints = new ArrayList<DSLLineBreakpoint>();
		IBreakpointManager manager = getBreakpointManager();
		manager.addBreakpointListener(this);

		IBreakpoint[] breakpoints = manager.getBreakpoints(DSLDebuggerConstants.ID_DSL_DEBUG_MODEL);
		for (IBreakpoint breakpoint : breakpoints) {
			if (breakpoint instanceof DSLLineBreakpoint) {
				breakpointAdded(breakpoint);
			}
		}
	}
	
	private void deinitBreakpoints() {
		getBreakpointManager().removeBreakpointListener(this);
	}

	private void initThreads() {
		dslThreads = new ArrayList<DSLThread>();
	}
	
	private void deinitThreads() {
		
	}

	@Override
	public String getModelIdentifier() {
		return DSLDebuggerConstants.ID_DSL_DEBUG_MODEL;
	}

	@Override
	public IDebugTarget getDebugTarget() {
		return this;
	}

	@Override
	public ILaunch getLaunch() {
		return launch;
	}

	@Override
	public boolean canTerminate() {
		return javaDebugTarget != null ? javaDebugTarget.canTerminate() : false;
	}

	@Override
	public boolean isTerminated() {
		return true;
		//return javaDebugTarget != null ? javaDebugTarget.isTerminated() : false;
	}

	@Override
	public void terminate() throws DebugException {
		if (javaDebugTarget != null)
			javaDebugTarget.terminate();

	}

	@Override
	public boolean canResume() {
		return javaDebugTarget != null ? javaDebugTarget.canResume() : false;
	}

	@Override
	public boolean canSuspend() {
		return javaDebugTarget != null ? javaDebugTarget.canSuspend() : false;
	}

	@Override
	public boolean isSuspended() {
		return javaDebugTarget != null ? javaDebugTarget.isSuspended() : false;
	}

	@Override
	public void resume() throws DebugException {
		if (javaDebugTarget != null)
			javaDebugTarget.resume();
	}

	@Override
	public void suspend() throws DebugException {
		if (javaDebugTarget != null)
			javaDebugTarget.suspend();
	}

	@Override
	public void breakpointAdded(IBreakpoint breakpoint) {
		if (supportsBreakpoint(breakpoint)) {
			if (getBreakpointManager().isEnabled()) {
				DSLLineBreakpoint dslLineBreakpoint = (DSLLineBreakpoint) breakpoint;
				dslLineBreakpoint.install(this);

				this.dslLineBreakpoints.add(dslLineBreakpoint);
			}
		}

	}

	@Override
	public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canDisconnect() {
		return javaDebugTarget != null ? javaDebugTarget.canDisconnect() : false;
	}

	@Override
	public void disconnect() throws DebugException {
		if (javaDebugTarget != null)
			javaDebugTarget.disconnect();

	}

	@Override
	public boolean isDisconnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean supportsStorageRetrieval() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IMemoryBlock getMemoryBlock(long startAddress, long length) throws DebugException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handleDebugEvents(DebugEvent[] events) {
		for (DebugEvent e : events) {
			handleDebugEvent(e);
		}

	}

	/**
	 * Creates, adds and returns a thread for the given java thread. A creation
	 * event is fired for the thread. Returns <code>null</code> if during the
	 * creation of the thread this target is set to the disconnected state.
	 * 
	 * @param javaThread
	 *            corresponding javathread
	 * @return model thread
	 */
	protected DSLThread createThread(IJavaThread javaThread) {
		DSLThread thread = new DSLThread(this, javaThread);
		if (isDisconnected()) {
			return null;
		}
		synchronized (dslThreads) {
			dslThreads.add(thread);
		}
		thread.fireCreationEvent();
		return thread;
	}

	protected void handleDebugEvent(DebugEvent event) {
		System.err.println("Debug event");
		System.err.println(event);

		Object eventSource = event.getSource();
		if (eventSource instanceof IJavaDebugTarget)
		{
			switch (event.getKind()) {
			case DebugEvent.CREATE: // Register GPL DebugTarget				
				assert this.javaDebugTarget == null;
				this.javaDebugTarget = (IJavaDebugTarget) eventSource;
				break;
			case DebugEvent.TERMINATE: 
				deinitialize();
				break;
			}			
		}
		else if (eventSource instanceof IProcess) {
			switch (event.getKind()) {
			case DebugEvent.CREATE:
				assert this.process == null;
				this.process = (IProcess) eventSource;
				break;
			}
		}
		else if (eventSource instanceof IJavaThread) {
			switch (event.getKind()) {
			case DebugEvent.CREATE:
				try {
					if (((IJavaThread) eventSource).isSystemThread() == false) {
						createThread((IJavaThread) eventSource);
					}
				} catch (DebugException e) {
					e.printStackTrace();
				}
				break;
			case DebugEvent.SUSPEND:
				for (DSLThread thread : dslThreads) {
					if (thread.getJavaThread() == (IJavaThread) eventSource) {
						thread.fireSuspendEvent(event.getDetail());
					}
				}
				break;
			}
		}
	}

	@Override
	public IProcess getProcess() {
		return this.process;
	}

	@Override
	public IThread[] getThreads() throws DebugException {
		return dslThreads.toArray(new IThread[dslThreads.size()]);
	}

	@Override
	public boolean hasThreads() throws DebugException {
		return dslThreads.size() != 0;
	}

	@Override
	public String getName() throws DebugException {
		return "DSL Debug Target";
	}

	@Override
	public boolean supportsBreakpoint(IBreakpoint breakpoint) {
		if (breakpoint instanceof DSLLineBreakpoint) {
			return true;
		} else {
			return false;
		}
	}

	public SimpleMapping getMapping(DSLLineBreakpoint bp) {
		try {
			return TraceabilityModelHelper.getMappingToJava(bp.getMarker().getResource(), bp.getLineNumber(),
					this.traceabilityModel, this.dslProgramModel);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IDebugTarget getJavaDebugTarget() {
		return javaDebugTarget;
	}
}
