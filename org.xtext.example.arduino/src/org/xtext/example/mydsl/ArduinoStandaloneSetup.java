/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ArduinoStandaloneSetup extends ArduinoStandaloneSetupGenerated {

	public static void doSetup() {
		new ArduinoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
