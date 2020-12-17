/*
 * Call information from the movies database package and then use these methods in the resources to call the requests
 */
package groupaaa_final_webapi.services;

import groupaaa_final_webapi.databases.Database;
import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 * @author x17492632
 * @author x17138744
 */

public class MovieService {

    
    Database m = new Database();
    private List<Movie> movies = m.getMoviesDB();
    Database a = new Database();
    private List<Account> accounts = a.getAccountsDB();
    
  
    // List movies
    // The customer can request the list of movies that exist in any account at any time.
    public List<Movie> getAllMovies() {
        return movies;
    }

    // Get Movies by specific ID
    public List<Movie> getAllMoviesForAccount(int account_ID) {
        return accounts.get(account_ID-1).getMovies();
    }
    
     public Movie getMovieByID(int account_ID, int movie_ID) {
        return accounts.get(account_ID-1).getMovies().get(movie_ID-1);
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
