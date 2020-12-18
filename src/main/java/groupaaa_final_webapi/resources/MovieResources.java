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
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/customers/{customerID}/accounts/{accountID}/movies")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class MovieResources {

    private MovieService movieService = new MovieService();
    
    
    //List ALL Movies for a specific {Account} 
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getAllMovies(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id) {
        System.out.println("get all movies for Accounts..."+acc_id);
	return movieService.getAllMoviesForAccount(cust_id, acc_id);
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
    
    //to create a new account for a specificcustomer
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Movie postAccount(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, Movie m) {
	movieService.addMovieThatWasRecommened(m , cust_id, acc_id);
        return m;
    }
    
    
    
    
    //this could be a PUT, and possibly in accounts not movies
    
    //add a new recommended movie to an account
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/add/{movieID}")
    //return a list of movies after a movie has been added by id
    public List<Movie> addRecommendedMovie(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @PathParam("movieID") int mov_id) {
    	System.out.println("getCustomerByID..."+cust_id+"getAccountByID..."+acc_id+"getMovieByID..."+mov_id);
	return movieService.addRecommendedMovieByID(cust_id,acc_id,mov_id);
    }
    
    
    @DELETE
    @Produces(MediaType.APPLICATION_XML)
    @Path("/delete/{movieID}")
    public List<Movie> deleteMovie(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @PathParam("movieID") int mov_id) {
    	System.out.println("getCustomerByID..."+cust_id+"getAccountByID..."+acc_id+"deleteMovieByID..."+mov_id);
	//returns the list of movies after a movie was deleted, since we cannot return a deleted movie
        return movieService.deleteMovieByID(cust_id,acc_id,mov_id);
    }
    
        
        
        
        
        
    /*
    // root path /movies will path to all my movies, which are specidied by the my 
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getMyMovies (@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @QueryParam("organised") String org) 
    { 
        List<Movie> movies = new ArrayList<>();
        if ((org != null) && (org.equals("My-List"))) 
           {   
            for (Movie mov: movieService.findMyRecommendedMovies(cust_id, acc_id, org)) { 
                if ((mov.equals(org))) {
                    movies.add(mov);
                }
            }
        }
        return movies;
    }    
    
    // path /movies?organised=recommended
    @GET 
    @Path("/recommended")
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getRecommendedMovies (@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @QueryParam("organised") String org) 
    { 
        List<Movie> movies = new ArrayList<>();
        if ((org != null) && (org.equals("recommended"))) 
           {   
            for (Movie mov: movieService.findMyRecommendedMovies(cust_id, acc_id, org)) { 
                if ((mov.equals(org))) {
                    movies.add(mov);
                }
            }
        }
        return movies;
    }
     
    // path /movies?organised=watched
    @GET
    @Path("/watched")
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getWatchedMovies (@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @QueryParam("watched") String org) 
    { 
        List<Movie> movies = new ArrayList<>();
        if ((org != null) && (org.equals("watched"))) 
           {   
            for (Movie mov: movieService.findMyRecommendedMovies(cust_id, acc_id, org)) { 
                if ((mov.equals(org))) {
                    movies.add(mov);
                }
            }
        }
        return movies;    
    } 
    */
}
