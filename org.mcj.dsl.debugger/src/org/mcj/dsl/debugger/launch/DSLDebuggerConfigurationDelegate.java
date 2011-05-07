package org.mcj.dsl.debugger.launch;

import org.eclipse.acceleo.traceability.TraceabilityModel;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.launching.JavaLaunchDelegate;
import org.mcj.dsl.debugger.model.DSLDebugTarget;

/**
 * This is a launch configuration delegate for DSL debugger.
 */
public class DSLDebuggerConfigurationDelegate extends JavaLaunchDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {
		
		System.out.println("Hooray, I have been launched!");

		String dslProgramFilename = configuration.getAttribute(
				DSLDebuggerConfigurationConstants.ATTR_DSL_PROGRAM_FILENAME, "");
		String traceabilityModelFilename = configuration.getAttribute(
				DSLDebuggerConfigurationConstants.ATTR_TRACEABILITY_MODEL_FILENAME, "");

		ResourceSet rs = new ResourceSetImpl();
		URI dslProgramUri = URI.createPlatformResourceURI(dslProgramFilename, true);
		Resource dslProgramResource = rs.getResource(dslProgramUri, true);
		EObject dslProgramModel = dslProgramResource.getContents().get(0);

		URI traceModelUri = URI.createPlatformResourceURI(traceabilityModelFilename, true);
		Resource traceModelResource = rs.getResource(traceModelUri, true);
		TraceabilityModel traceModel = (TraceabilityModel) traceModelResource.getContents().get(0);

		DSLDebugTarget dslDebuggerDebugTarget = new DSLDebugTarget(launch, traceModel, dslProgramModel);
		launch.addDebugTarget(dslDebuggerDebugTarget);
		
		// listening of debug events (for fun)
		DebugPlugin.getDefault().addDebugEventListener(new IDebugEventSetListener() {

			@Override
			public void handleDebugEvents(DebugEvent[] events) {
				for (DebugEvent e : events) {
					System.err.println(e.getKind() + " from " + e.getSource() + " [" + e.getSource().getClass()
							+ "] DATA: " + e.getData());
				}

			}
		});
		

		// delegate to original Java launch
		super.launch(configuration, mode, launch, monitor);

	}
}
