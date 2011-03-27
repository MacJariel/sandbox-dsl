package gen.karel.api;

import org.mcj.karel.core.api.Karel;

public interface KarelTheRobot extends Karel {

    /**
     * User defined command SimpleCmd 
     */
	public void simpleCmd();
    /**
     * User defined command TurnLeft 
     */
	public void turnLeft();
    /**
     * User defined command TurnRight 
     */
	public void turnRight();
}	
