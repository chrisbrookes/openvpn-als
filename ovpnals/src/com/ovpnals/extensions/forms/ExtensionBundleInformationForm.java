package com.ovpnals.extensions.forms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ovpnals.core.forms.CoreForm;
import com.ovpnals.extensions.ExtensionBundle;

public class ExtensionBundleInformationForm extends CoreForm {
    final static Log log = LogFactory.getLog(ExtensionBundleInformationForm.class);
    
    private ExtensionBundle bundle;
    
    public void initialise(ExtensionBundle bundle) {
    	this.bundle = bundle;
    }
    
    public ExtensionBundle getBundle() {
    	return bundle;
    }
}
