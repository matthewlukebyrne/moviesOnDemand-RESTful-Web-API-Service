/*
 * Call information from the movies database package and then use these methods in the resources to call the requests
 */
package groupaaa_final_webapi.services;

import groupaaa_final_webapi.databases.Database;
import groupaaa_final_webapi.models.Accounts;
import groupaaa_final_webapi.models.Customers;
import groupaaa_final_webapi.models.Movies;
import java.util.List;

/**
 * @author x17492632
 * @author x17138744
 */

public class MovieService {

    
    Database m = new Database();
    private List<Movies> movies = m.getMoviesDB();
    
    Database a = new Database();
    private List<Accounts> accounts = a.getAccountsDB();
    
    Database c = new Database();
    private List<Customers> customers = c.getCustomersDB();
    
    
//    // Add movie
//    // A customer can add a new recommended movie to the list of movies specific to an account. 
//    public List<Movies> addMovie() {
//        
//    }
//    
//    // Transfer Movies
//    //The customer can specify a particular movie to be transferred (moved) from one account to another account hold by the customer. 
//    public List<Movies> transferMovie(){
//        
//    }
//    
//    // Remove Movies
//    //  A customer can remove a movie from list of movies specific to an account. 
//    public List<Movies> removeMovie(){
//        
//    }
  
    // List movies
    // The customer can request the list of movies that exist in any account at any time.
    public List<Movies> getAllMovies() {
        return movies;
    }

    // Get Movies by specific ID
    public Movies getMovie(int id) {
        return movies.get(id - 1);
    }
}
