package org.mcj.dsl.debugger.ui.adapters;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.texteditor.ITextEditor;
import org.mcj.dsl.debugger.DSLDebuggerConstants;
import org.mcj.dsl.debugger.breakpoints.DSLLineBreakpoint;

public class DSLBreakpointAdapter implements IToggleBreakpointsTarget {

	public DSLBreakpointAdapter() {
	}

	@Override
	public void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
		ITextEditor textEditor = (ITextEditor) part;
		if (textEditor != null) {
			IResource resource = (IResource) textEditor.getEditorInput().getAdapter(IResource.class);
			ITextSelection textSelection = (ITextSelection) selection;
			int lineNumber = textSelection.getStartLine();
			
			// delete existing breakpoint
			IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(DSLDebuggerConstants.ID_DSL_DEBUG_MODEL);
			for (IBreakpoint bp : breakpoints)
			{
				if (resource.equals(bp.getMarker().getResource()) &&
						bp instanceof ILineBreakpoint &&
						((ILineBreakpoint) bp).getLineNumber() == lineNumber + 1) {
					bp.delete();
					return;
				}
			}
			
			// add new breakpoint
			DSLLineBreakpoint dslBreakpoint = new DSLLineBreakpoint(resource, lineNumber);
			DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(dslBreakpoint);
		}
	}

	@Override
	public boolean canToggleLineBreakpoints(IWorkbenchPart part, ISelection selection) {
		return true;
	}

	@Override
	public void toggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canToggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void toggleWatchpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean canToggleWatchpoints(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		return false;
	}

}
