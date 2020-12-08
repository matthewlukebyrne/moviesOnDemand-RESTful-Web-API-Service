/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.models;

/**
 *@author keanrz
 * @author matth
 */

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private int id;
    private String name;
    private String address;
    private String email;
    public static List<Account> account = new ArrayList<>();

    
    public Customer() {
    }

    public Customer(int id, String name, String address, String email, List <Account> account) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public static List<Account> getAccount() {
        return account;
    }

    public static void setAccount(List<Account> account) {
        Customer.account = account;
    }
}