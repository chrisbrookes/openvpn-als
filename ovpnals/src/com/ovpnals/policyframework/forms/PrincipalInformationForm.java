package com.ovpnals.policyframework.forms;

import com.ovpnals.core.forms.CoreForm;
import com.ovpnals.policyframework.Principal;

/**
 */
public class PrincipalInformationForm extends CoreForm {
    private Principal principal;
    
    /**
     * @param principal
     */
    public void initialise(Principal principal) {
        this.principal = principal;
    }
    
    /**
     * @return Principal
     */ 
    public Principal getPrincipal() {
        return principal;
    }
}