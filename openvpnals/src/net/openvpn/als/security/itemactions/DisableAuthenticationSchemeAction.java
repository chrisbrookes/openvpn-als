
				/*
 *  OpenVPNALS
 *
 *  Copyright (C) 2003-2006 3SP LTD. All Rights Reserved
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2 of
 *  the License, or (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public
 *  License along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */
			
package net.openvpn.als.security.itemactions;

import net.openvpn.als.policyframework.Permission;
import net.openvpn.als.policyframework.PolicyConstants;
import net.openvpn.als.security.AuthenticationScheme;
import net.openvpn.als.security.AuthenticationSchemeSequenceItem;
import net.openvpn.als.security.SessionInfo;
import net.openvpn.als.table.AvailableTableItemAction;
import net.openvpn.als.table.TableItemAction;

/**
 */
public class DisableAuthenticationSchemeAction extends TableItemAction {

    /**
     * Default constructor
     */
    public DisableAuthenticationSchemeAction() {
        super("disable", "security", 300, "", false, SessionInfo.MANAGEMENT_CONSOLE_CONTEXT,
                        PolicyConstants.AUTHENTICATION_SCHEMES_RESOURCE_TYPE, new Permission[] { PolicyConstants.PERM_CREATE_EDIT_AND_ASSIGN,  PolicyConstants.PERM_EDIT_AND_ASSIGN });
    }
    
    @Override
    public String getPath(AvailableTableItemAction availableItem) {
        AuthenticationSchemeSequenceItem item = (AuthenticationSchemeSequenceItem)availableItem.getRowItem();
        return "/showAuthenticationSchemes.do?actionTarget=disable&selectedResource=" + item.getResource().getResourceId();
    }

    @Override
    public boolean isEnabled(AvailableTableItemAction availableItem) {
        AuthenticationSchemeSequenceItem item = (AuthenticationSchemeSequenceItem)availableItem.getRowItem();
        return ((AuthenticationScheme)item.getResource()).getEnabled();
    }
}
