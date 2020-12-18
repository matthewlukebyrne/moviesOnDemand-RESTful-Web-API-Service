/*
 *  This is the area where the required data is populated in a mock database to simulate information being passed through to the requests.
 */
package groupaaa_final_webapi.databases;

import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.models.Customer;
import groupaaa_final_webapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 * @author x17492632
 * @author x17138744
 *
 * The way you map the database is important - otherwise the items will be
 * empty!
 */
public class Database {

    public static List<Customer> customersDB = new ArrayList<>();
    public static List<Account> accountsDB = new ArrayList<>();
    public static List<Movie> moviesDB = new ArrayList<>();
    public static boolean init = true;

    // Create a constructor for the class
    public Database() {
        if (init) {

            // Create some movies
            Movie m1 = new Movie(1, "Matrix", "sci-fi", "recommended");
            Movie m2 = new Movie(2, "Nacho Libre 2", "comedy", "recommended");
            Movie m3 = new Movie(3, "Harry potter", "Thriller", "watched");
            Movie m4 = new Movie(4, "Terminator", "sci-fi", "recommended");
            Movie m5 = new Movie(5, "Hilarious Movie", "comedy", "watched");
            Movie m6 = new Movie(6, "Matrix Reloaded", "sci-fi", "recommended");

            moviesDB.add(m1);
            moviesDB.add(m2);
            moviesDB.add(m3);
            moviesDB.add(m4);
            moviesDB.add(m5);
            moviesDB.add(m6);

            // Create some Accounts
            Account a1 = new Account(1, "Children", "password", moviesDB);
            Account a2 = new Account(2, "Adults", "password345", moviesDB);
            Account a3 = new Account(3, "superkearnz", "password", moviesDB);
            Account a4 = new Account(4, "supermatt", "password345", moviesDB);
            Account a5 = new Account(5, "Children", "password", moviesDB);
            Account a6 = new Account(6, "Adults", "password345", moviesDB);

            accountsDB.add(a1);
            accountsDB.add(a2);
            accountsDB.add(a3);
            accountsDB.add(a4);
            accountsDB.add(a5);
            accountsDB.add(a6);

            // Create some customers
            Customer c1 = new Customer(1, "Matt", "123 Town St", "matt@gmail.com", accountsDB);
            Customer c2 = new Customer(2, "Sam", "134 Hill St", "sam@gmail.com", accountsDB);
            Customer c3 = new Customer(3, "Harry", "112 Lamb St", "harry@gmail.com", accountsDB);
            Customer c4 = new Customer(4, "Steve", "178 Dave St", "steve@gmail.com", accountsDB);
            Customer c5 = new Customer(5, "Bob", "167 Hope St", "bob@gmail.com", accountsDB);
            Customer c6 = new Customer(6, "Rudy", "45 Cruise St", "rudy@gmail.com", accountsDB);

            customersDB.add(c1);
            customersDB.add(c2);
            customersDB.add(c3);
            customersDB.add(c4);
            customersDB.add(c5);
            customersDB.add(c6);

            init = false;
        }
    }

    public static List<Account> getAccountsDB() {
        return accountsDB;
    }

    public static List<Movie> getMoviesDB() {
        return moviesDB;
    }

    public static List<Customer> getCustomersDB() {
        return customersDB;
    }
}