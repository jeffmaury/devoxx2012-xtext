
package com.devoxx2012.xtext.demo1;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Demo1StandaloneSetup extends Demo1StandaloneSetupGenerated{

	public static void doSetup() {
		new Demo1StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

