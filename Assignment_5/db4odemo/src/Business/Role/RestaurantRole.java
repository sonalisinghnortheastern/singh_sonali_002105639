/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.RestaurantWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class RestaurantRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new RestaurantWorkAreaJPanel(userProcessContainer,business);
    }

    
    
}
