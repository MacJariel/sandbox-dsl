package org.mcj.dsl.debugger;

public final class DSLDebuggerConstants {
	
	public static final String PLUGIN_ID = DSLDebuggerPlugin.PLUGIN_ID;
	
	public static final String ID_DSL_DEBUG_MODEL = "org.mcj.dsl.debugger.model";
	
	public static final String ID_DSL_LINE_MARKER_BREAKPOINT = "org.mcj.dsl.debugger.dslLineMarker";
	
	// Suppress default constructor for noninstantiability
	private DSLDebuggerConstants() {
		throw new AssertionError();
	}
}
