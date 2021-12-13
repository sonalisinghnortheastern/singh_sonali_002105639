/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private int customerId;
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    private String address;
    private long mobileNumber;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
