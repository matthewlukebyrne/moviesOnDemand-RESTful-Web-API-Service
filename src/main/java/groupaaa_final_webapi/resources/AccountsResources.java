/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author x17492632
 * @author x17138744
 */

package groupaaa_final_webapi.resources;

import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.services.AccountService;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;



@Path("/customers/{customerID}/accounts")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

public class AccountsResources {

   private AccountService accountService = new AccountService();
   
    //List ALL Accountss for a specific {customerID} 
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Account> getAllAccounts(@PathParam("customerID") int cust_id) {
        System.out.println("get all Accounts for Customer..."+cust_id);
	return accountService.getAllAccountsByCustomer(cust_id);
    }
    
    // list a specific {accountID} for a  specific {customerID}. 
    //GET accounts for a customer specifying the customerID that was associated with @PATH in the Customer Resources
    @GET
    @Path("/{accountID}")
    @Produces(MediaType.APPLICATION_XML)
    public Account getAccount(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id) {
    	System.out.println("getAccountByID..."+ acc_id + "getCustomerByID..."+cust_id);
	return accountService.getAccountByID(cust_id,acc_id);
    }
    
    /*
    //to create a new account for a specificcustomer
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Account postAccount(@PathParam("CustomerID") int cust_id, Account a) {
	return accountService.createAccount(a , cust_id);
    }*/
    
    //to path to movies
    @Path("/{accountID}/movies")
    @Produces(MediaType.APPLICATION_XML)
    public MovieResources getMoviesResources(@PathParam("customerID") int cust_id, @PathParam("accountID") int acc_id) {
	System.out.println("Getting movies subresources...");
	return new MovieResources();
    }
       
}
