/*
 * Call information from the movies database package and then use these methods in the resources to call the requests
 */
package groupaaa_final_webapi.services;

import groupaaa_final_webapi.databases.Database;
import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.models.Customer;
import groupaaa_final_webapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 * @author x17492632
 * @author x17138744
 */

public class MovieService {

    Database c = new Database();
    private List<Customer> customers = c.getCustomersDB();
    Database m = new Database();
    private List<Movie> movies = m.getMoviesDB();
    Database a = new Database();
    private List<Account> accounts = a.getAccountsDB();
    

    //List Movies - The customer can request the list of movies that exist in any account at any time.
    public List<Movie> getAllMoviesForAccount(int customer_ID, int account_ID) {
        return customers.get(customer_ID-1).getAccounts().get(account_ID-1).getMovies();
    }
    
    // Get Movies by specific ID
    public Movie getMovieByID(int customer_ID, int account_ID, int movie_ID) {
        return customers.get(customer_ID-1).getAccounts().get(account_ID-1).getMovies().get(movie_ID-1);
        //Account acc = customers.get(customer_ID-1).getAccounts().get(account_ID-1);
        //Movie mov = acc.getMovies().get(movie_ID-1);
        //return mov;
    }
    
    // Post a new recommended movie
    public Movie addANewMovie(Movie m, int customer_ID, int account_ID) {
        
        Account acc = customers.get(customer_ID-1).getAccounts().get(account_ID-1);
        m.setMovieID(acc.getMovies().size() + 1);
	acc.addMovie(m);
        return m;
       
    }
    
    
    // Remove a Movie by specific ID
    public List<Movie> deleteMovieByID(int customer_ID, int account_ID, int movie_ID) {
        Account acc = customers.get(customer_ID-1).getAccounts().get(account_ID-1);
        acc.removeMovie(movie_ID-1);
        return accounts.get(account_ID-1).getMovies();
    }
    
    
    
    
    public Movie transferMovieByID(int transferAcc_ID, int customer_ID, int account_ID, int movie_ID) {
        Movie mov = getMovieByID(customer_ID, account_ID, movie_ID);
        //not sure if this is the "right" way but essentially we are adding to another account and then removing from the account we are currently in
        deleteMovieByID(customer_ID, account_ID, movie_ID);
        addANewMovie(mov, customer_ID, transferAcc_ID);
        return mov;
    }
    
    
    
    
    
    
   
    // find all recommended movies specific to an account 
    public List<Movie> findMyRecommendedMovies(int customer_ID, int account_ID) {
      List<Movie> recommendedMovies = new ArrayList<>();

      for (Movie m: getAllMoviesForAccount(customer_ID, account_ID)) {
          if ((m.getOrganised().equals("recommended"))) {
             recommendedMovies.add(m);
          }
      }
      return recommendedMovies;
    }
    
     // find all watched movies specific to an account
    public List<Movie> findMyWatchedMovies(int customer_ID, int account_ID) {
      List<Movie> watchedMovies = new ArrayList<>();

      for (Movie m: getAllMoviesForAccount(customer_ID, account_ID)) {
          if ((m.getOrganised().equals("watched"))) {
             watchedMovies.add(m);
          }
      }
      return watchedMovies;
    }
}
