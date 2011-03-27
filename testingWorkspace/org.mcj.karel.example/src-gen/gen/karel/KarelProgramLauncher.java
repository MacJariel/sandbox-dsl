package gen.karel;

import org.mcj.karel.core.api.*;
import org.mcj.karel.core.api.impl.*;

import gen.karel.api.*;
import gen.karel.api.impl.*;

/**
 * This is an example of KarelProgram
 */
public class KarelProgramLauncher {
	public static void main(String args[]) {
		// preparing the robot API
		KarelTheRobot karel = new KarelTheRobotImpl();
		ExecutionEngine<KarelTheRobot> eEngine = SimpleExecutionEngine
				.getInstance();
		eEngine.setKarel(karel);

		// Karel initialization
		eEngine.getKarel().setHeading(KarelHeadingEnum.EAST);
		eEngine.getKarel().setPosition(1, 5);
		eEngine.setBoardSize(10, 20);

		// create program instance
		KarelProgram<KarelTheRobot> program = new KarelProgramImpl();

		// start program execution
		eEngine.execute(program);
	}
}
