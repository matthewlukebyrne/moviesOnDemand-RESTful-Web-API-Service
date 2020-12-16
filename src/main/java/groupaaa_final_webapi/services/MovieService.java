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
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author x17492632
 * @author x17138744
 */

public class MovieService {

    
    Database m = new Database();
    private List<Movie> movies = m.getMoviesDB();
    
    
    
    
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
    public List<Movie> getAllMovies() {
        return movies;
    }

    
    // Get Movies by specific ID
    public Movie getMovie(int id) {
        return movies.get(id - 1);
    }
    

    public List<Movie> findRecommendedMovies(String organized) {
      List<Movie> watchedMovies = new ArrayList<>();

      for (Movie m: getAllMovies()) {
          if ((organized == null || m.getName().equals(organized))) {
             watchedMovies.add(m);
          }
      }
      return watchedMovies;
    }
    
    public List<Movie> findWatchedMovies(String organized) {
      List<Movie> watchedMovies = new ArrayList<>();

      for (Movie m: getAllMovies()) {
          if ((organized == null || m.getName().equals(organized))) {
             watchedMovies.add(m);
          }
      }
      return watchedMovies;
    }
}
