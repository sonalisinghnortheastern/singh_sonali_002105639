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
public class DeliveryMan extends UserAccount{
    private String name;
    private long mobileNumber;
    private String address;
    private boolean isDeliveryPersonAvailable;

    public boolean isIsDeliveryPersonAvailable() {
        return isDeliveryPersonAvailable;
    }

    public void setIsDeliveryPersonAvailable(boolean isDeliveryPersonAvailable) {
        this.isDeliveryPersonAvailable = isDeliveryPersonAvailable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
 public DeliveryMan(String name,  long mobileNumber,String address,String userName, String password,int uniqueId) {
        setUsername(userName);
        setPassword(password);
        setUniqueId(uniqueId);
        setRole(new DeliverManRole());
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address=address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    @Override
    public String toString() {
        if(name == null){
            return "";
        }
        return this.name;
    }
    
}
