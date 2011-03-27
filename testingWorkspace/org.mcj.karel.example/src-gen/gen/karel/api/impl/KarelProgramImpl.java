package gen.karel.api.impl;

import gen.karel.api.*;
import org.mcj.karel.core.api.*;

public class KarelProgramImpl implements KarelProgram<KarelTheRobot> {

	public void execute(ExecutionEngine<KarelTheRobot> engine) {
		KarelTheRobot karel = engine.getKarel();
		
		// TODO put here checks for hitting the wall and 
			karel.move();				
											
			karel.move();				
											
			if (! karel.isWallAhead()		) {
				karel.turnRight();							
										
			} else {
			}	
											
			karel.get();				
											
			karel.simpleCmd();							
											
			karel.simpleCmd();							
											
			karel.put();				
											
	}
}	
