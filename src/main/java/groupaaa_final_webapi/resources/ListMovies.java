/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.resources;

/**
 *@author keanrz
 * @author matth
 */
import groupaaa_final_webapi.models.Account;
import groupaaa_final_webapi.services.AccountService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/accounts")

public class Resource {
    
    AccountService aService = new AccountService();
    /*
    If using POSTMAN as client, remember setting a Header 
    "Accept:application/json" for retrieving JSON format
    "Accept:application/xml" for retrieving XML format
    */    
   
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Account> getMessagesXML() {
        return aService.getAllAccounts();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account> getMessagesJSON() {
        return aService.getAllAccounts();
    }

          
 
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Account getMessageXML(@PathParam("id") int id) {
        return aService.getAccount(id);
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getMessageJSON(@PathParam("id") int id) {
        return aService.getAccount(id);
    }
} 