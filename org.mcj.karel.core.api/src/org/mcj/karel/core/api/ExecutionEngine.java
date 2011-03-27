package org.mcj.karel.core.api;

/**
 * Interface to Karel program execution engine.
 * 
 * @author Michal Malohlava
 *
 * @param <K>
 */
public interface ExecutionEngine<K extends Karel> {

	/**
	 * Set size of Karel's ground field.
	 * 
	 * @param width
	 * @param height
	 */
	public void setBoardSize(int width, int height);

	public K getKarel();

	public void setKarel(K karel);
	
	public void execute(KarelProgram<K> program);
}