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
import groupaaa_final_webapi.models.Accounts;
import groupaaa_final_webapi.models.Customers;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    // This is called from the the Database package with Accounts and Customers
    private final List<Accounts> accounts = Database.getAccountsDB();
    private final List<Customers> customers = Database.getCustomersDB();

    /*Customers should be able to create an account for a family member. If the customer
         has at least one account, he/she should be able to add additional accounts. For example, a
        typical customer may have an account for children and one account for the adult members of the family. */
    
    public Accounts createAccount(Accounts a) {
        a.setId(accounts.size() + 1);
        accounts.add(a);
        System.out.println("201 - resource created with path: /create/account" + String.valueOf(a.getId()));
        System.out.println("Updated` Account Information:" + a.printAccount());
        return a;
    }
    
    public List<Accounts> getAllAccounts() {
        return accounts;
    }

    public Accounts getAccount(int id) {
        return accounts.get(id - 1);
    }
}
