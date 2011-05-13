package org.mcj.dsl.debugger.breakpoints;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.jdt.debug.core.JDIDebugModel;
import org.mcj.dsl.debugger.DSLDebuggerConstants;
import org.mcj.dsl.debugger.model.DSLDebugTarget;
import org.mcj.dsl.debugger.traceability.SimpleMapping;

public class DSLLineBreakpoint extends LineBreakpoint {

	private DSLDebugTarget debugTarget;

	private ILineBreakpoint gplBreakpoint = null;

	/**
	 * Constructs an empty DSLLineBreakpoint. This constructor is used by the BreakpointManager to
	 * recreate breakpoints from persistent markers.
	 */
	public DSLLineBreakpoint()
	{
	}
	
	public DSLLineBreakpoint(final IResource file, final int lineNumber) throws CoreException {
		IWorkspaceRunnable job = new IWorkspaceRunnable() {

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = file.createMarker(DSLDebuggerConstants.ID_DSL_LINE_MARKER_BREAKPOINT);
				setMarker(marker);
				marker.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber + 1);
				marker.setAttribute(IBreakpoint.ID, getModelIdentifier());
				marker.setAttribute(IMarker.MESSAGE, "DSL Line breakpoint: " + file.getName() + " [line: "
						+ (lineNumber + 1) + "]");
			}
		};
		
		{
			// DEBUG: lists all markers on the resource
			IMarker[] markers = file.findMarkers(DSLDebuggerConstants.ID_DSL_LINE_MARKER_BREAKPOINT, true, IResource.DEPTH_INFINITE);
			for (IMarker marker: markers) {
				System.out.println("Marker " + marker.getId() + ": " + marker.getAttribute(IMarker.MESSAGE, "[no message]"));
			}
		}
		
		run(getMarkerRule(file), job);
	}

	@Override
	public String getModelIdentifier() {
		return DSLDebuggerConstants.ID_DSL_DEBUG_MODEL;
	}

	public void install(DSLDebugTarget debugTarget) {
		this.debugTarget = debugTarget;

		SimpleMapping mapping = this.debugTarget.getMapping(this);
		if (mapping != null) {
			try {
				// FIXME this is nasty and does not follow concept of Java types
				// typeName should be the full class name in the target file
				String typeName = mapping.getTarget().getFullPath().removeFileExtension().removeFirstSegments(2)
						.toOSString().replace('/', '.');
				int lineNumber = 12; //mapping.getTargetLineNumber();

				createGplBreakpoint(mapping.getTarget(), typeName, lineNumber, mapping.getTargetStartChar(),
						mapping.getTargetEndChar());

				IDebugTarget jDebugTarget = debugTarget.getJavaDebugTarget();
				if (jDebugTarget != null)
					jDebugTarget.breakpointAdded(this.gplBreakpoint);

			} catch (CoreException e) {
				e.printStackTrace();
			}

		}
	}
	
	@Override
	public void delete() throws CoreException {
		
		if (this.gplBreakpoint != null) {
			this.gplBreakpoint.delete();
		}
		super.delete();
	}

	private void createGplBreakpoint(IResource resource, String typeName, int lineNumber, int charStart, int charEnd)
			throws CoreException {
		// TODO: create only if not exist

		this.gplBreakpoint = JDIDebugModel.createLineBreakpoint(resource, typeName, lineNumber, charStart, charEnd, 0,
				true, null);
	}
}
