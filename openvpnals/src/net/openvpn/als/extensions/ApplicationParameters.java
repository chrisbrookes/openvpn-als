package net.openvpn.als.extensions;

import net.openvpn.als.boot.AbstractPropertyClass;
import net.openvpn.als.boot.AbstractPropertyKey;

/**
 * A simple property class to support application parameter definitions.
 * 
 * @author brett
 */
public class ApplicationParameters extends AbstractPropertyClass {
	
	/**
	 * Property class name
	 */
	public final static String NAME = "applicationParameters";

	/**
	 * Constructor
	 */
	public ApplicationParameters() {
		super(NAME, true);
	}

	/* (non-Javadoc)
	 * @see net.openvpn.als.boot.AbstractPropertyClass#retrievePropertyImpl(net.openvpn.als.boot.AbstractPropertyKey)
	 */
	protected String retrievePropertyImpl(AbstractPropertyKey key)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Not yet supported.");
	}

	/* (non-Javadoc)
	 * @see net.openvpn.als.boot.AbstractPropertyClass#storePropertyImpl(net.openvpn.als.boot.AbstractPropertyKey, java.lang.String)
	 */
	protected String storePropertyImpl(AbstractPropertyKey key, String value)
			throws IllegalArgumentException {
		throw new UnsupportedOperationException("Not yet supported.");
	}

}
