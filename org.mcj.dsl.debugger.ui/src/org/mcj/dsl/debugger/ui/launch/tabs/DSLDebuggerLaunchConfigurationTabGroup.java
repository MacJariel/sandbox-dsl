package org.mcj.dsl.debugger.ui.launch.tabs;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;

import org.eclipse.jdt.debug.ui.launchConfigurations.*;
/**
 * This class defines launch configuration tab group of the DSL Debugger.
 *
 */
public class DSLDebuggerLaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public DSLDebuggerLaunchConfigurationTabGroup() {
	}

	/**
	 * Creates tabs for the launch configuration.
	 */
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new JavaMainTab(),
				new RefreshTab(),
				new JavaArgumentsTab(),
				new JavaJRETab(),
				new JavaClasspathTab(),
				new SourceLookupTab(),
				new EnvironmentTab(),
				new CommonTab()
		};
		
		setTabs(tabs);
	}

}
