package org.mcj.dsl.debugger;

import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.acceleo.engine.service.AcceleoService;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.mcj.dsl.debugger.listeners.AcceleoGenerationListener;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class DSLDebuggerCore extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.mcj.dsl.debugger.core"; //$NON-NLS-1$

	// The shared instance
	private static DSLDebuggerCore plugin;

	// The AcceleoTextGenerationListener
	private IAcceleoTextGenerationListener acceleoTextGenerationListener = new AcceleoGenerationListener();

	/**
	 * The constructor
	 */
	public DSLDebuggerCore() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		AcceleoService.addStaticListener(this.acceleoTextGenerationListener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);

		AcceleoService.removeStaticListener(this.acceleoTextGenerationListener);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static DSLDebuggerCore getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
