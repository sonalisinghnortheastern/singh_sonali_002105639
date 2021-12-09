/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.NGOEmployeeRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sonal
 */
public class NGOAdminOrganisation extends Organization{
    public NGOAdminOrganisation() {
        super(Type.NGOAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOEmployeeRole());
        return roles;
    }
    
    
}
