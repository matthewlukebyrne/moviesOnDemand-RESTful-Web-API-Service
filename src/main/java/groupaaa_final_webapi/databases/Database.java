/*
 *  This is the area where the required data is populated in a mock database to simulate information being passed through to the requests.
 */
package groupaaa_final_webapi.databases;

import groupaaa_final_webapi.models.Accounts;
import groupaaa_final_webapi.models.Customers;
import groupaaa_final_webapi.models.Movies;
import java.util.ArrayList;
import java.util.List;

/**
 * @author x17492632
 * @author x17138744
 */
public class Database {

    public static List<Customers> customerDB = new ArrayList<>();
    public static List<Accounts> accountDB = new ArrayList<>();
    public static List<Movies> movieDB = new ArrayList<>();
    public static boolean init = true;

    // Create a constructor for the class
    public Database() {
        if (init) {

            // Create some customers
            Customers c1 = new Customers(1, "Matt", "123 Town St", "matt@gmail.com", getAccountsDB());
            Customers c2 = new Customers(2, "Sam", "134 Hill St", "matt@gmail.com", getAccountsDB());
            Customers c3 = new Customers(3, "Harry", "112 Lamb St", "matt@gmail.com", getAccountsDB());
            Customers c4 = new Customers(4, "Steve", "178 Dave St", "matt@gmail.com", getAccountsDB());
            Customers c5 = new Customers(5, "Bob", "167 Hope St", "matt@gmail.com", getAccountsDB());
            Customers c6 = new Customers(6, "Rudy", "45 Cruise St", "matt@gmail.com", getAccountsDB());

            // Create some Accounts
            Accounts a1 = new Accounts(1, "superkearnz", "password",  getMoviesDB());
            Accounts a2 = new Accounts(2, "supermatt", "password345", getMoviesDB());
            Accounts a3 = new Accounts(3, "lemmy", "password2", getMoviesDB());
            Accounts a4 = new Accounts(4, "harrykane", "passworz", getMoviesDB());
            Accounts a5 = new Accounts(5, "frankieboyle", "passte", getMoviesDB());
            Accounts a6 = new Accounts(6, "xxx-tentacion", "passwody", getMoviesDB());

            // Create some movies
            Movies m1 = new Movies(1, "Matrix", "sci-fi", true, true);
            Movies m2 = new Movies(2, "Nacho Libre 2", "comedy", true, true);
            Movies m3 = new Movies(3, "Le Espana", "fantasy", false, true);
            Movies m4 = new Movies(4, "Terminator", "sci-fi", true, false);
            Movies m5 = new Movies(5, "40 Year Old Virgin", "comedy", true, true);
            Movies m6 = new Movies(6, "Matrix Reloaded", "sci-fi", true, true);

            movieDB.add(m1);
            movieDB.add(m2);
            movieDB.add(m3);
            movieDB.add(m4);
            movieDB.add(m5);
            movieDB.add(m6);

            accountDB.add(a1);
            accountDB.add(a2);
            accountDB.add(a3);
            accountDB.add(a4);
            accountDB.add(a5);
            accountDB.add(a6);

            customerDB.add(c1);
            customerDB.add(c2);
            customerDB.add(c3);
            customerDB.add(c4);
            customerDB.add(c5);
            customerDB.add(c6);

            init = false;
        }
    }

    public static List<Accounts> getAccountsDB() {
        return accountDB;
    }

    public static List<Movies> getMoviesDB() {
        return movieDB;
     }
    
    public static List<Customers> getCustomersDB() {
        return customerDB;
     }
}
