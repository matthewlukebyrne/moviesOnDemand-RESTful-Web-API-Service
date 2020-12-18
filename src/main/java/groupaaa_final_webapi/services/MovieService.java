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
    
    
    public Movie addMovieThatWasRecommened(Movie m, int customer_ID, int account_ID) {
        
        Customer cust = customers.get(customer_ID-1);
        //int custID = cust.getCustomerID();
        Account acc = accounts.get(account_ID-1);
        m.setMovieID(acc.getMovies().size() + 1);
	acc.addMovie(m);
        
        System.out.println("201 - resource created with path: /customer/" + String.valueOf(cust.getCustomerID())+"/accounts/"+String.valueOf(acc.getAccountID())+"/movie/"+String.valueOf(m.getMovieID()));
        return m;
    }
    
    
    
    /////////
    /////////
    /////////
    ///////// change this to just add a new movie as in post,i.e add a new movie with the reccomended param to an account.  and if it doesnt work like ben and doesnt add to a specific account, then try the filter way and create a new method for addRecommendedMovie
    public List<Movie> addRecommendedMovieByID(int customer_ID, int account_ID, int movie_ID){
        Account acc = customers.get(customer_ID-1).getAccounts().get(account_ID-1);
        //acc.addRecommendedMovie(movie_ID-1);
        return accounts.get(account_ID-1).getMovies();
    }
    
    
    
    public List<Movie> deleteMovieByID(int customer_ID, int account_ID, int movie_ID) {
        Account acc = customers.get(customer_ID-1).getAccounts().get(account_ID-1);
        acc.removeMovie(movie_ID-1);
        return accounts.get(account_ID-1).getMovies();
    }
    
    
    
    
    
    
    public List<Movie> findMyListOfMovies(int customer_ID, int account_ID, String org) {
      List<Movie> watchedMovies = new ArrayList<>();

      for (Movie m: getAllMoviesForAccount(customer_ID, account_ID)) {
          if ((m.equals(org))) {
             watchedMovies.add(m);
          }
      }
      return watchedMovies;
    }
     
    public List<Movie> findMyRecommendedMovies(int customer_ID, int account_ID, String org) {
      List<Movie> watchedMovies = new ArrayList<>();

      for (Movie m: getAllMoviesForAccount(customer_ID, account_ID)) {
          if ((m.equals(org))) {
             watchedMovies.add(m);
          }
      }
      return watchedMovies;
    }
    
    public List<Movie> findMyWatchedMovies(int customer_ID, int account_ID, String org) {
      List<Movie> watchedMovies = new ArrayList<>();

      for (Movie m: getAllMoviesForAccount(customer_ID, account_ID)) {
          if ((m.equals(org))) {
             watchedMovies.add(m);
          }
      }
      return watchedMovies;
    }
}
