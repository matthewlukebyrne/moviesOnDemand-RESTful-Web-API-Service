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
public class Customers {
    private int id;
    private String name;
    private String address;
    private String email;
    public static List<Accounts> account = new ArrayList<>();

    
    public Customers() {
    }

    public Customers(int id, String name, String address, String email, List <Accounts> account) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        Customers.account = new ArrayList<>();
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

    public static List<Accounts> getAccount() {
        return account;
    }

    public static void setAccount(List<Accounts> account) {
        Customers.account = account;
    }

    @Override
    public String toString() {
        return "Customers{" + "id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + '}';
    }
    
    
}



