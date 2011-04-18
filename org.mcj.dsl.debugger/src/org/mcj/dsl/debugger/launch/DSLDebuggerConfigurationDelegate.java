package org.mcj.dsl.debugger.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

/**
 * This is a launch configuration delegate for DSL debugger.
 */
public class DSLDebuggerConfigurationDelegate extends JavaLaunchDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		System.out.println("Hooray, I have been launched!");
		
	}
}
