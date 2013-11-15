package de.linkinglod.service;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class LinkingLodProperties {

	// writes to linkinglod.properties in src
	private static final String BUNDLE_NAME = "linkinglod"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private LinkingLodProperties() {

	}

	public static String getString( String key ) {

		try {
			return RESOURCE_BUNDLE.getString(key);
		}
		catch ( MissingResourceException e ) {
			return '!' + key + '!';
		}
	}
}