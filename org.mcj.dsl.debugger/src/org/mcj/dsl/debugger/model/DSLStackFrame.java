package org.mcj.dsl.debugger.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;

public class DSLStackFrame extends DSLDebugElement implements IStackFrame {

	private DSLThread dslThread;

	public DSLStackFrame(IDebugTarget target, DSLThread thread) {
		super(target);
		this.dslThread = thread;
	}

	@Override
	public IVariable[] getVariables() throws DebugException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasVariables() throws DebugException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLineNumber() throws DebugException {
		
		// this.dslThread.getJavaThread().getStackFrames()
		return 1;
	}

	@Override
	public int getCharStart() throws DebugException {
		return 0;
	}

	@Override
	public int getCharEnd() throws DebugException {
		return 0;
	}

	@Override
	public String getName() throws DebugException {
		return "A stack frame";
	}

	@Override
	public IRegisterGroup[] getRegisterGroups() throws DebugException {
		return null;
	}

	@Override
	public boolean hasRegisterGroups() throws DebugException {
		return false;
	}

	@Override
	public boolean canStepInto() {
		return dslThread.canStepInto();
	}

	@Override
	public boolean canStepOver() {
		return dslThread.canStepOver();
	}

	@Override
	public boolean canStepReturn() {
		return dslThread.canStepReturn();
	}

	@Override
	public boolean isStepping() {
		return dslThread.isStepping();
	}

	@Override
	public void stepInto() throws DebugException {
		dslThread.stepInto();
	}

	@Override
	public void stepOver() throws DebugException {
		dslThread.stepOver();
	}

	@Override
	public void stepReturn() throws DebugException {
		dslThread.stepReturn();

	}

	@Override
	public boolean canResume() {
		return dslThread.canResume();
	}

	@Override
	public boolean canSuspend() {
		return dslThread.canSuspend();
	}

	@Override
	public boolean isSuspended() {
		return dslThread.isSuspended();
	}

	@Override
	public void resume() throws DebugException {
		dslThread.resume();
	}

	@Override
	public void suspend() throws DebugException {
		dslThread.suspend();
	}

	@Override
	public boolean canTerminate() {
		return dslThread.canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return dslThread.isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		dslThread.terminate();
	}

	@Override
	public IThread getThread() {
		return dslThread;
	}
}
