/**
 * generated by Xtext 2.11.0
 */
package org.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.RobotRuntimeModule;
import org.xtext.RobotStandaloneSetup;
import org.xtext.ide.RobotIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RobotIdeSetup extends RobotStandaloneSetup {
  @Override
  public Injector createInjector() {
    RobotRuntimeModule _robotRuntimeModule = new RobotRuntimeModule();
    RobotIdeModule _robotIdeModule = new RobotIdeModule();
    return Guice.createInjector(Modules2.mixin(_robotRuntimeModule, _robotIdeModule));
  }
}