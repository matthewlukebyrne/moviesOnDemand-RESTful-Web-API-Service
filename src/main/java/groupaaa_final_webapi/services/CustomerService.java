/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.services;

import groupaaa_final_webapi.databases.Database;
import groupaaa_final_webapi.models.Customer;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author matth
 */
public class CustomerService {
    
    
    // This is called from the the Database package
    private final List<Customer> customers = Database.getCustomersDB();
    

    /*Customers should be able to create an account for a family member. If the customer
         has at least one account, he/she should be able to add additional accounts. For example, a
        typical customer may have an account for children and one account for the adult members of the family. */
    
    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomer(int CustomerID) {
        //return customers.get(id - 1);
        return customers.get(CustomerID);
    }
    
    public Customer createCustomer(Customer c) {
        c.setCustomerID(customers.size() + 1);
        customers.add(c);
        System.out.println("201 - resource created with path: /create/customer" + String.valueOf(c.getCustomerID()));
        System.out.println("Updated` Customers:" + c.printCustomer());
        return c;
    }
    
   
   
}