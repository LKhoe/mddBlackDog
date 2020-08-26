/*
 * generated by Xtext 2.21.0
 */
package br.ufes.nemo.ledzeppllin.blackdog.ide;

import br.ufes.nemo.ledzeppllin.blackdog.BlackDogRuntimeModule;
import br.ufes.nemo.ledzeppllin.blackdog.BlackDogStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class BlackDogIdeSetup extends BlackDogStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new BlackDogRuntimeModule(), new BlackDogIdeModule()));
	}
	
}
