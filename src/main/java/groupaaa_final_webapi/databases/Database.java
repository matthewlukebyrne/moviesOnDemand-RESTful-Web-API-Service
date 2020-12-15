/*
 *  This is the area where the required data is populated in a mock database to simulate information being passed through to the requests.
 */
package groupaaa_final_webapi.databases;

import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 * @author x17492632
 * @author x17138744
 */

public class Database {

    public static List<Account> accountDB = new ArrayList<>();
    public static List<Movie> movieDB = new ArrayList<>();
    public static boolean init = true;

    // Create a constructor for the class
    public Database() {
        if (init) {

            // Create some comments
            Account a1 = new Account(1, "superkearnz", "password",  movieDB);
            Account a2 = new Account(2, "supermatt", "password345", movieDB);
            Account a3 = new Account(3, "lemmy", "password2", movieDB);
            Account a4 = new Account(4, "harrykane", "passworz", movieDB);
            Account a5 = new Account(5, "frankieboyle", "passte", movieDB);
            Account a6 = new Account(6, "xxx-tentacion", "passwody", movieDB);

            accountDB.add(a1);
            accountDB.add(a2);
            accountDB.add(a3);
            accountDB.add(a4);
            accountDB.add(a5);
            accountDB.add(a6);

            Movie m1 = new Movie(1, "Matrix", "sci-fi", true, true);
            Movie m2 = new Movie(2, "Nacho Libre 2", "comedy", true, true);
            Movie m3 = new Movie(3, "Le Espana", "fantasy", false, true);
            Movie m4 = new Movie(4, "Terminator", "sci-fi", true, false);
            Movie m5 = new Movie(5, "40 Year Old Virgin", "comedy", true, true);
            Movie m6 = new Movie(6, "Matrix Reloaded", "sci-fi", true, true);

            movieDB.add(m1);
            movieDB.add(m2);
            movieDB.add(m3);
            movieDB.add(m4);
            movieDB.add(m5);
            movieDB.add(m6);

            init = false;
        }
    }
    
        public static List<Account> getAccountDB() {
        return accountDB;
    }
    
    public static List<Movie> getMovieDB() {
        return movieDB;
    }
}
