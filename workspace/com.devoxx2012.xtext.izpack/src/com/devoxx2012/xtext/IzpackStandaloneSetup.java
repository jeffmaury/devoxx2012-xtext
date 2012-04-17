
package com.devoxx2012.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class IzpackStandaloneSetup extends IzpackStandaloneSetupGenerated{

	public static void doSetup() {
		new IzpackStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

