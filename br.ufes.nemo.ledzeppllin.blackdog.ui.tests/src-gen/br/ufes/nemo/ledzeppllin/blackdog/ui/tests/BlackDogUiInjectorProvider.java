/*
 * generated by Xtext 2.21.0
 */
package br.ufes.nemo.ledzeppllin.blackdog.ui.tests;

import br.ufes.nemo.ledzeppllin.blackdog.ui.internal.BlackdogActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class BlackDogUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BlackdogActivator.getInstance().getInjector("br.ufes.nemo.ledzeppllin.blackdog.BlackDog");
	}

}
