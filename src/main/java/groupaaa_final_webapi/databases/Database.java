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
 */
public class Database {

    public static List<Customer> customerDB = new ArrayList<>();
        public static List<Account> accountDB = new ArrayList<>();
        public static List<Movie> movieDB = new ArrayList<>();
        public static boolean init = true;

        // Create a constructor for the class
        public Database() {
            if (init) {

                // Create some customers
                Customer c1 = new Customer(1, "Matt", "123 Town St", "matt@gmail.com", getAccountsDB());
                Customer c2 = new Customer(2, "Sam", "134 Hill St", "matt@gmail.com", getAccountsDB());
                Customer c3 = new Customer(3, "Harry", "112 Lamb St", "matt@gmail.com", getAccountsDB());
                Customer c4 = new Customer(4, "Steve", "178 Dave St", "matt@gmail.com", getAccountsDB());
                Customer c5 = new Customer(5, "Bob", "167 Hope St", "matt@gmail.com", getAccountsDB());
                Customer c6 = new Customer(6, "Rudy", "45 Cruise St", "matt@gmail.com", getAccountsDB());

                // Create some Accounts
                Account a1 = new Account(1, "Children", "password",  getMoviesDB());
                Account a2 = new Account(2, "Adults", "password345", getMoviesDB());
                Account a3 = new Account(3, "superkearnz", "password",  getMoviesDB());
                Account a4 = new Account(4, "supermatt", "password345", getMoviesDB());
                Account a5 = new Account(5, "Children", "password",  getMoviesDB());
                Account a6 = new Account(6, "Adults", "password345", getMoviesDB());
                Account a7 = new Account(7, "Children", "password",  getMoviesDB());
                Account a8 = new Account(8, "Adults", "password345", getMoviesDB());
                

                // Create some movies
                Movie m1 = new Movie(1, "Matrix", "sci-fi", "watched");
                Movie m2 = new Movie(2, "Nacho Libre 2", "comedy", "recommended");
                Movie m3 = new Movie(3, "Harry potter", "Thriller", "watched");
                Movie m4 = new Movie(4, "Terminator", "sci-fi", "recommended");
                Movie m5 = new Movie(5, "Hilarious Movie", "comedy", "watched");
                Movie m6 = new Movie(6, "Matrix Reloaded", "sci-fi", "recommended");

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
                accountDB.add(a7);
                accountDB.add(a8);

                customerDB.add(c1);
                customerDB.add(c2);
                customerDB.add(c3);
                customerDB.add(c4);
                customerDB.add(c5);
                customerDB.add(c6);

                init = false;
            }
        }

        public static List<Account> getAccountsDB() {
            return accountDB;
        }

        public static List<Movie> getMoviesDB() {
            return movieDB;
         }

        public static List<Customer> getCustomersDB() {
            return customerDB;
         }
}
