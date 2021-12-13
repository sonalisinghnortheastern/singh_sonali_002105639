/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private int deliveryManId;
    private boolean isDeliveryPersonAvailable=true;

    public boolean isIsDeliveryPersonAvailable() {
        return isDeliveryPersonAvailable;
    }

    public void setIsDeliveryPersonAvailable(boolean isDeliveryPersonAvailable) {
        this.isDeliveryPersonAvailable = isDeliveryPersonAvailable;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        if(name == null){
            return "";
        }
        return this.name;
    }
    
}
