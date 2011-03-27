/**
 * 
 */
package org.mcj.karel.core.api.impl;

import org.mcj.karel.core.api.ExecutionEngine;
import org.mcj.karel.core.api.Karel;
import org.mcj.karel.core.api.KarelProgram;

/**
 * Simple Karel program execution engine.
 * 
 * @author Michal Malohlava
 *
 */
public class SimpleExecutionEngine<K extends Karel> implements ExecutionEngine<K> {
	
	public static <K extends Karel> SimpleExecutionEngine<K> getInstance() {
		return new SimpleExecutionEngine<K>();
	}

	@SuppressWarnings("unused")
	private int boardWidth;
	@SuppressWarnings("unused")
	private int boardHeight;
	
	private K karelTheRobot;
	
	private SimpleExecutionEngine() {		
	}
	
	@Override
	public void setBoardSize(int x, int y) {
		this.boardWidth = x;
		this.boardHeight = y;
	}	
	
	@Override
	public K getKarel() {
		return this.karelTheRobot;
	}
	
	@Override
	public void setKarel(K karel) {
		this.karelTheRobot = karel;
	}
	
	@Override
	public void execute(KarelProgram<K> program) {
		program.execute(this);		
	}	
}
