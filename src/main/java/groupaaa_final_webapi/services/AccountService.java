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
import java.util.List;


public class AccountService {

    // This is called from the the Database package
    Database customerdb = new Database();
    //do not make private final
    private List<Customer> customers = customerdb.getCustomersDB();
    
    Database accountdb = new Database();
    private List<Account> accounts = accountdb.getAccountsDB();
    
    
    //retrieves ALL Accounts for a specific CustomerID by calling getAccounts from Accounts.java
    public List<Account> getAllAccountsByCustomer(int customer_ID) {
        return customers.get(customer_ID-1).getAccounts();
    }
    
    public Account getAccountByID(int customer_ID, int account_ID) {
        return customers.get(customer_ID-1).getAccounts().get(account_ID-1);
    }

    /*Customers should be able to create an account for a family member. If the customer
         has at least one account, he/she should be able to add additional accounts. For example, a
        typical customer may have an account for children and one account for the adult members of the family. */
    
    public Account createAccount(Account a, int customer_ID) {
        
        Customer cust = customers.get(customer_ID-1);
        a.setAccountID(cust.getAccounts().size() + 1);
	cust.addAccountToCustomer(a);
        
        System.out.println("201 - resource created with path: /customer/" + String.valueOf(cust.getCustomerID())+"/accountss/"+String.valueOf(a.getAccountID()));
        //System.out.println("Updated` Account Information:" + a.printAccount());
        return a;
    }
    
}
