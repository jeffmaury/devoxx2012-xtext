/*
 * generated by Xtext
 */
package com.devoxx2012.xtext.demo1.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Demo1ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return com.devoxx2012.xtext.demo1.ui.internal.Demo1Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return com.devoxx2012.xtext.demo1.ui.internal.Demo1Activator.getInstance().getInjector("com.devoxx2012.xtext.demo1.Demo1");
	}
	
}