
/*
 * generated by Xtext
 */
 
package org.mcj.karel.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class KarelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.mcj.karel.ui.internal.KarelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.mcj.karel.ui.internal.KarelActivator.getInstance().getInjector("org.mcj.karel.Karel");
	}
	
}
