package org.mcj.dsl.debugger.model;

import java.util.ArrayList;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.jdt.debug.core.IJavaThread;

public class DSLThread extends DSLDebugElement implements IThread {

	private IJavaThread javaThread;
	
	private ArrayList<DSLStackFrame> stackFrames;
	
	public DSLThread(IDebugTarget target, IJavaThread javaThread) {
		super(target);
		this.javaThread = javaThread;
		this.stackFrames = new ArrayList<DSLStackFrame>();
		
		// TESTING
		this.stackFrames.add(new DSLStackFrame(target, this));
	}
	
	public IJavaThread getJavaThread()
	{
		return javaThread;
	}
	
	@Override
	public boolean canResume() {
		return javaThread.canResume();
	}

	@Override
	public boolean canSuspend() {
		return javaThread.canSuspend();
	}

	@Override
	public boolean isSuspended() {
		return javaThread.isSuspended();
	}

	@Override
	public void resume() throws DebugException {
		javaThread.resume();
	}

	@Override
	public void suspend() throws DebugException {
		javaThread.suspend();
	}

	@Override
	public boolean canStepInto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canStepOver() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canStepReturn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStepping() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void stepInto() throws DebugException {
		// TODO Auto-generated method stub

	}

	@Override
	public void stepOver() throws DebugException {
		// TODO Auto-generated method stub

	}

	@Override
	public void stepReturn() throws DebugException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canTerminate() {
		return javaThread.canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return javaThread.isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		javaThread.terminate();
	}

	@Override
	public IStackFrame[] getStackFrames() throws DebugException {
		return stackFrames.toArray(new IStackFrame[stackFrames.size()]); 
	}

	@Override
	public boolean hasStackFrames() throws DebugException {
		return stackFrames.size() != 0;
	}

	@Override
	public int getPriority() throws DebugException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public IStackFrame getTopStackFrame() throws DebugException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() throws DebugException {
		return "DSL <" + javaThread.getName() + ">";
	}

	@Override
	public IBreakpoint[] getBreakpoints() {
		return javaThread.getBreakpoints();
	}

}
