/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    ArrayList<Customer> customers;
    public  CustomerDirectory()
    {
        this.customers=new ArrayList<>();
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customer) {
        this.customers.add(customer);
    }
}
