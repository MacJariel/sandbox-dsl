package org.mcj.dsl.debugger.traceability;

import org.eclipse.core.resources.IResource;

public class SimpleMapping {

	IResource source;
	IResource target;

	int sourceLineNumber;
	int targetStartLineNumber;
	int targetEndLineNumber;
	int targetStartChar;
	int targetEndChar;
	

	public IResource getSource() {
		return source;
	}

	public int getSourceLineNumber() {
		return sourceLineNumber;
	}

	public int getTargetStartChar() {
		return targetStartChar;
	}

	public int getTargetEndChar() {
		return targetEndChar;
	}

	public IResource getTarget() {
		return target;
	}

	public int getTargetStartLineNumber() {
		return targetStartLineNumber;
	}

	public int getTargetEndLineNumber() {
		return targetEndLineNumber;
	}

}
