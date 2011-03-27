/**
 * 
 */
package org.mcj.karel.generator.services;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

/**
 * @author Michal Malohlava
 *
 */
public class ProjectService {
	
	/**
	 * Create a new project of a given name if it does not exists.
	 * 
	 * @param name
	 * @throws CoreException 
	 */
	public void createProject(String name) throws CoreException {
		IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
		
		IProject project = wsRoot.getProject(name);
		if (project.exists()) {
			return;
		}
		
		project.create(null);
	}
}
