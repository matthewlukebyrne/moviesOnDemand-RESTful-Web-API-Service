/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.resources;

import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.models.Customer;
import groupaaa_final_webapi.models.Movie;
import groupaaa_final_webapi.services.AccountService;
import groupaaa_final_webapi.services.MovieService;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author matth
 */
@Path("/accounts")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON

public class AccountsResources {

   private AccountService accountService = new AccountService();

    /*
    If using POSTMAN as client, remember setting a Header 
    "Accept:application/json" for retrieving JSON format
    "Accept:application/xml" for retrieving XML format
     */
    
  /*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Accounts> getMessagesJSON() {
        return accountService.getAllAccounts();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Accounts getMessageJSON(@PathParam("id") int id) {
        return accountService.getAccount(id);
    }
*/
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Account> getAllAccounts(@PathParam("customerID") int id) {
        System.out.println("get all Accounts for Customer..."+id);
	return accountService.getAllAccounts();
    }
    
    //GET accounts for a customer specifying the customerID that is associated with @PATH in the Customer Resources
    @GET
    public Account getAccounts(@PathParam("customerID") int c_id) {
    	System.out.println("getaccountByID..."+c_id);
	return accountService.getAccount(c_id);
    }
    
    
    //to create a new account
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Account postAccount(@PathParam("CustomerID") int c_id, Account a) {
	return accountService.createAccount(a, c_id);
    }
    
    
    
    //to path to movies
    @Path("/{accountID}/moviess/")
    public MovieResources MoviesResources() {
	System.out.println("Getting movies subresources...");
	return new MovieResources();
    }
    
}
