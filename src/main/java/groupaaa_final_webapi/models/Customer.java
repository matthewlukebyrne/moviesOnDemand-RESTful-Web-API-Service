/*
 *  This is the area where the required data is declated in the models package for the Customers information
 */
package groupaaa_final_webapi.models;

/**
 * @author x17492632
 * @author x17138744
 */

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private int customerID;
    private String name;
    private String address;
    private String email;
    private List<Account> accounts = new ArrayList<>();
    
    
    public Customer() {
    }

    public Customer(int id, String name, String address, String email, List <Account> account) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.email = email;
        //Customers.account = new ArrayList<>();
        this.accounts = account;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int id) {
        this.customerID = customerID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccount(List<Account> account) {
        this.accounts = account;
    }
    
    public void addAccount(Account account) {
       accounts.add(account);
       System.out.println("add a new account");
    }
    
    public String printCustomer() {
        String str = this.getCustomerID()+" "+this.getName()+ " "+this.getAddress()+ " "+this.getEmail();
        return str;
    }
    
    public String printAllAccounts() {
        String allaccounts = "";
        for ( int i=0; i<accounts.size(); i++)
            allaccounts=allaccounts+accounts.get(i).printAccount()+" ";
       return allaccounts;
    }
    
    //@Override
    //public String toString() {
    //    return "Customers{" + "id=" + CiustomerID + ", name=" + name + ", address=" + address + ", email=" + email + '}';
    //}
}



