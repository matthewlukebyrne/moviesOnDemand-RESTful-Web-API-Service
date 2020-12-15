/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.resources;

import groupaaa_final_webapi.models.Accounts;
import groupaaa_final_webapi.models.Movies;
import groupaaa_final_webapi.services.AccountService;
import groupaaa_final_webapi.services.MovieService;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author matth
 */
@Path("accounts")
public class ListAccounts {

   AccountService accountService = new AccountService();

    /*
    If using POSTMAN as client, remember setting a Header 
    "Accept:application/json" for retrieving JSON format
    "Accept:application/xml" for retrieving XML format
     */
    
  
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

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Accounts> getMessagesXML() {
        return accountService.getAllAccounts();
    }

   
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Accounts getMessageXML(@PathParam("id") int id) {
        return accountService.getAccount(id);
    }
}
