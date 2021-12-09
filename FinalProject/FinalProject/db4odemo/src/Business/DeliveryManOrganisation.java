/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Role.DeliverManRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sonal
 */
public class DeliveryManOrganisation extends Organization{
    public DeliveryManOrganisation() {
        super(Type.DeliveryMan.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliverManRole());
        return roles;
    }
}
