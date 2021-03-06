/*
 * generated by Xtext 2.21.0
 */
package br.ufes.nemo.ledzeppllin.blackdog.ui;

import br.ufes.nemo.ledzeppllin.blackdog.ui.internal.BlackdogActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class BlackDogExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(BlackdogActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		BlackdogActivator activator = BlackdogActivator.getInstance();
		return activator != null ? activator.getInjector(BlackdogActivator.BR_UFES_NEMO_LEDZEPPLLIN_BLACKDOG_BLACKDOG) : null;
	}

}
