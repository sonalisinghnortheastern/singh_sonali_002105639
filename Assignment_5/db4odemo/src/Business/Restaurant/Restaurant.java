/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Role.RestaurantRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Restaurant extends UserAccount{
    private String name;
    private String address;
    private long  mobileNumber;
    private Menu menu;

    public Restaurant(String name, String address, long mobileNumber,String userName, String password,int uniqueId) {
        setUsername(userName);
        setPassword(password);
        setRole(new RestaurantRole());
        setUniqueId(uniqueId);
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.menu = new Menu();
    }

    public Restaurant(){
    
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
