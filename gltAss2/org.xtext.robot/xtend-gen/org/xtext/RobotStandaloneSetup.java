/**
 * generated by Xtext 2.11.0
 */
package org.xtext;

import org.xtext.RobotStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RobotStandaloneSetup extends RobotStandaloneSetupGenerated {
  public static void doSetup() {
    new RobotStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}