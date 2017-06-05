/*
 * generated by Xtext 2.11.0
 */
package org.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.RobotRuntimeModule
import org.xtext.RobotStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class RobotIdeSetup extends RobotStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new RobotRuntimeModule, new RobotIdeModule))
	}
	
}