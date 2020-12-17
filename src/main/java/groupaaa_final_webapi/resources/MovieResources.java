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
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/customers/{customerID}/accounts/{accountsID}/movies")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class MovieResources {

    private MovieService movieService = new MovieService();
    
    
    //List ALL Movies for a specific {Account} 
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getAllMovies(@PathParam("customerID") int cust_ID, @PathParam("accountID") int acc_ID) {
        System.out.println("get all movies for Accounts..."+acc_ID);
	return movieService.getAllMoviesForAccount(cust_ID, acc_ID);
    }
    
    // list a specific {movieID} for a  specific {accountID}. 
    //GET accounts for a customer specifying the customerID that was associated with @PATH in the Accounts Resources
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{movieID}")
    public Movie getMovie(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @PathParam("movieID") int mov_id) {
    	System.out.println("getCustomerByID..."+cust_id+"getAccountByID..."+acc_id+"getMovieByID..."+mov_id);
	return movieService.getMovieByID(cust_id,acc_id,mov_id);
    }
    /*
    // path /movies/recommended
    @GET 
    @Produces(MediaType.APPLICATION_XML)
    //@Produces(MediaType.APPLICATION_JSON)
     public List<Movie> getRecommendedMovies (@QueryParam("organised") String organised) 
     { 
       if ((organised != null) && (organised.equals("recommended"))) 
          {        
              return movieService.findRecommendedMovies(organised); 
          } 
        return movieService.getAllMovies();    
     }
     
     // path /movies/watched
    @GET
    @Produces(MediaType.APPLICATION_XML)
    //@Produces(MediaType.APPLICATION_JSON)
     public List<Movie> getWatchedMovies (@QueryParam("watched") String organised) 
     { 
       if ((organised != null) && (organised.equals("watched")))
          {        
              return movieService.findWatchedMovies(organised); 
          } 
        return movieService.getAllMovies();    
     } */
     
}
