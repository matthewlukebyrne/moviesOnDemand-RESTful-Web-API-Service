/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.resources;

import groupaaa_final_webapi.models.Customer;
import groupaaa_final_webapi.services.CustomerService;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author matth
 */

@Path("/Customer")
public class CustomersResources {

    CustomerService customerService = new CustomerService();

   
    @GET
    @Path("/{CustomerID}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getMessageJSON(@PathParam("CustomerID") int id) {
        return customerService.getCustomer(id);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> getAccountsJSON() {
        return customerService.getAllCustomers();
    }
    
    /*
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customers> getCustomerXML() {
        return customerService.getAllCustomers();
    }


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Customers getCustomerXML(@PathParam("id") int id) {
        return customerService.getCustomer(id);
    }
    */
    //to create a new customer
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Customer postCustomer(Customer c) {
	return customerService.createCustomer(c);
    }
    
    //to path to accounts
    @Path("/{customerID}/accounts/")
    public AccountsResources getAccountResources() {
	System.out.println("Getting accounts subresources...");
	return new AccountsResources();
    }
    
    
    //add more PUT, PATCH ect.
}