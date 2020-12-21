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
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/customers/{customerID}/accounts/{accountID}/movies")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)

public class MovieResources {

    private MovieService movieService = new MovieService();
   
    // URL: localhost:49000/api/customers/1/accounts/1/movies
    // List Movies - The customer can request a list of all Movies for any {Account} 
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getAllMovies(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id) {
        System.out.println("get all movies for Accounts..."+acc_id);
	return movieService.getAllMoviesForAccount(cust_id, acc_id);
    }
     
    // URL: GET localhost:49000/api/customers/1/accounts/1/movies/2
    // list a specific {movieID} for a  specific {accountID}
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{movieID}")
    public Movie getMovie(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @PathParam("movieID") int mov_id) {
    	System.out.println("getCustomerByID..."+cust_id+"getAccountByID..."+acc_id+"getMovieByID..."+mov_id);
	return movieService.getMovieByID(cust_id,acc_id,mov_id);
    }
    
    // URL: localhost:49000/api/customers/1/accounts/1/movies
    // with parameters specified in the body
    //add a new recommended movie to an account
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Movie postMovie(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, Movie m) {
	movieService.addANewMovie(m , cust_id, acc_id);
        return m;
    }
    
    
    // URL: localhost:49000/api/customers/1/accounts/1/movies/transferMovie/1?transferAccountID=2
    // transfer a movie from one customers account to another
    @PUT
    @Path("/transferMovie/{movieId}")
    public Movie transferMovie(@QueryParam("transferAccountID") int transferAcc_id, @PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @PathParam("movieID") int mov_id) {
            return movieService.transferMovieByID(transferAcc_id, cust_id, acc_id, mov_id);
    } 
    
    
    // URL: localhost:49000/api/customers/1/accounts/1/movies/1
    // with parameters specified in the body
    @DELETE
    @Produces(MediaType.APPLICATION_XML)
    @Path("/{movieID}")
    public List<Movie> deleteMovie(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id, @PathParam("movieID") int mov_id) {
    	System.out.println("getCustomerByID..."+cust_id+"getAccountByID..."+acc_id+"deleteMovieByID..."+mov_id);
	//returns the list of movies after a movie was deleted, since we cannot return a deleted movie
        return movieService.deleteMovieByID(cust_id,acc_id,mov_id);
    }
    


    
        
        
    // URL: localhost:49000/api/customers/{customerID}/accounts/{accountID}/movies/recommended
    // A customer can retrieve their recommended movie(s) specific to an account.
    @GET 
    @Path("/recommended")
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getRecommendedMovies (@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id) 
    { 
        List<Movie> movies = new ArrayList<>();
         
        for (Movie mov: movieService.findMyRecommendedMovies(cust_id, acc_id)) { 
                movies.add(mov);
            } 
        return movies;
    }
     
    // URL: localhost:49000/api/customers/{customerID}/accounts/{accountID}/movies/watched
    // A customer can retrieve their watched movie(s) specific to an account.
    @GET
    @Path("/watched")
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getWatchedMovies (@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id) 
    { 
        List<Movie> movies = new ArrayList<>();
         
        for (Movie mov: movieService.findMyWatchedMovies(cust_id, acc_id)) { 
                movies.add(mov);
            } 
        return movies;   
    } 

}
