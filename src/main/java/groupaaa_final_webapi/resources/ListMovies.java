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
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/movies")

public class ListMovies {

    MovieService movieService = new MovieService();

    /*
    If using POSTMAN as client, remember setting a Header 
    "Accept:application/json" for retrieving JSON format
    "Accept:application/xml" for retrieving XML format
     */
    // path /movies
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getMessagesJSON() {
        return movieService.getAllMovies();
    }

    // path /movies/1
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Movie getMessageJSON(@PathParam("id") int id) {
        return movieService.getMovie(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Movie> getMessagesXML() {
        return movieService.getAllMovies();
    }

//    // List Movies by ID number
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Movie getMessageXML(@PathParam("id") int id) {
        return movieService.getMovie(id);
    }
}
