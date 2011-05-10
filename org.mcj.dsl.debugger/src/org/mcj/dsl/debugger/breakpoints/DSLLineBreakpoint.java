package org.mcj.dsl.debugger.breakpoints;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.mcj.dsl.debugger.DSLDebuggerConstants;

public class DSLLineBreakpoint extends LineBreakpoint {

	public DSLLineBreakpoint(final IResource file, final int lineNumber) throws CoreException
	{
		IWorkspaceRunnable job = new IWorkspaceRunnable() {
			
			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = file.createMarker(DSLDebuggerConstants.ID_DSL_LINE_MARKER_BREAKPOINT);
				setMarker(marker);
				marker.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber + 1);
				marker.setAttribute(IBreakpoint.ID, getModelIdentifier());
				marker.setAttribute(IMarker.MESSAGE, "DSL Line breakpoint: " + file.getName() + " [line: " + (lineNumber + 1) + "]");
			}
		};
		
		run(getMarkerRule(file), job);
	}
	
	@Override
	public String getModelIdentifier() {
		return DSLDebuggerConstants.ID_DSL_DEBUG_MODEL;
	}

}
