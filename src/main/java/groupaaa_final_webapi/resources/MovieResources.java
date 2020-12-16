/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.resources;

/**
 * @author x17492632
 * @author x17138744
 */
import groupaaa_final_webapi.models.Movie;
import groupaaa_final_webapi.services.MovieService;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/movies")

public class MovieResources {

    MovieService movieService = new MovieService();


    // path /movies
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getMessagesJSON() {
        return movieService.getAllMovies();
    }
    
    // List Movies by ID number
    // path /movies/1
    @GET
    @Path("/{MovieID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Movie getMessageJSON(@PathParam("MovieID") int id) {
        return movieService.getMovie(id);
    }
    
    
    /*
    //JSON
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getMessagesXML() {
        return movieService.getAllMovies();
    }

    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Movie getMessageXML(@PathParam("id") int id) {
        return movieService.getMovie(id);
    }
    */
    
    // path /movies/recommended
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_XML)
     public List<Movie> getRecommendedMovies (@QueryParam("organized") String organized) 
     { 
       if ((organized != null)) 
          {        
              return movieService.findRecommendedMovies(organized); 
          } 
        return movieService.getAllMovies();    
     }
     // path /movies/watched
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_XML)
     public List<Movie> getWatchedMovies (@QueryParam("watched") String organized) 
     { 
       if ((organized != null)) 
          {        
              return movieService.findWatchedMovies(organized); 
          } 
        return movieService.getAllMovies();    
     } 
}
