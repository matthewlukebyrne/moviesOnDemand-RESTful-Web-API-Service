/*
 * Call information from the movies database package and then use these methods in the resources to call the requests
 */
package groupaaa_final_webapi.services;

import groupaaa_final_webapi.databases.Database;
import groupaaa_final_webapi.models.Movie;
import java.util.List;

/**
 * @author x17492632
 * @author x17138744
 */



public class MovieService {

    Database d = new Database();
    private List<Movie> movie = d.getMovieDB();

    // List All Movies
    public List<Movie> getAllMovies() {
        return movie;
    }

    // Get Movie ID
    public Movie getMovie(int id) {
        return movie.get(id - 1);
    }
}
