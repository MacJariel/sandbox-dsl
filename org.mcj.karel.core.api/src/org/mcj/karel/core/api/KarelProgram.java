/**
 * 
 */
package org.mcj.karel.core.api;

/**
 * Interface implemented by a generated class which contain Karel execution.  
 * 
 * @author Michal Malohlava
 *
 */
public interface KarelProgram<K extends Karel> {
	/**
	 * Execute Karel program with help of engine.
	 * 
	 * @param engine
	 */
	void execute(ExecutionEngine<K> engine);	
}
