/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount {
    private String name;
    private String address;
    private long mobileNumber;
    public Customer(String name, String address, long mobileNumber,String userName, String password,int uniqueId) {
        setUsername(userName);
        setPassword(password);
        setUniqueId(uniqueId);
        setRole(new CustomerRole());
        this.name = name;
        this.address = address;
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

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
}
