/*
 * generated by Xtext 2.11.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.robot.ui.internal.RobotActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RobotExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RobotActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RobotActivator.getInstance().getInjector(RobotActivator.ORG_XTEXT_ROBOT);
	}
	
}
