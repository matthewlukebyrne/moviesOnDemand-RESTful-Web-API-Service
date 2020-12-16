/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.services;

/**
 * @author x17492632
 * @author x17138744
 */
import groupaaa_final_webapi.databases.Database;
import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.models.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class AccountService {

    // This is called from the the Database package
    private List<Customer> customer = Database.getCustomersDB();
    private List<Account> accounts = Database.getAccountsDB();
    
    
    public List<Account> getAllAccountsByCustomer(int CustomerID) {
        return customer.get(CustomerID-1).getAccounts();
    }
    
    public Account getAccountByID(int customerID, int accountID) {
        return customer.get(customerID-1).getAccounts().get(accountID-1);
    }

    /*Customers should be able to create an account for a family member. If the customer
         has at least one account, he/she should be able to add additional accounts. For example, a
        typical customer may have an account for children and one account for the adult members of the family. */
    
    public Account createAccount(Account a, int c_id) {
        Customer customer = list.get(c_id-1);
        a.setAccountID(customer.getAccounts().size() + 1);
	customer.addAccount(a);
        
        a.setAccountID(accounts.size() + 1);
        accounts.add(a);
        System.out.println("201 - resource created with path: /messages/" + String.valueOf(customer.getCustomerID())+"/comments/"+String.valueOf(a.getAccountID()));
        System.out.println("Updated` Account Information:" + a.printAccount());
        return a;
    }
    
   
    
    
    public List<Account> getAllAccounts() {
        return accounts;
    }

    public Account getAccount(int id) {
        return accounts.get(id - 1);
    }
    
    
}
