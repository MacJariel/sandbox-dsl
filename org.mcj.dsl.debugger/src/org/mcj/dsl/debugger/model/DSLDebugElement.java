package org.mcj.dsl.debugger.model;

import org.eclipse.debug.core.model.DebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.mcj.dsl.debugger.DSLDebuggerConstants;

public class DSLDebugElement extends DebugElement  {

	public DSLDebugElement(IDebugTarget target) {
		super(target);
	}
	
	@Override
	public String getModelIdentifier() {
		return DSLDebuggerConstants.ID_DSL_DEBUG_MODEL;
	}

	public DSLDebugTarget getDSLDebugTarget() {
		return (DSLDebugTarget) getDebugTarget();
	}
	
}
