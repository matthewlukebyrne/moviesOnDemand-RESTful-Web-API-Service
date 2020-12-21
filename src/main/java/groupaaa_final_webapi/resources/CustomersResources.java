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

import groupaaa_final_webapi.models.Customer;
import groupaaa_final_webapi.services.CustomerService;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;


@Path("/customers")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)

public class CustomersResources {

    CustomerService customerService = new CustomerService();
   
    // localhost:49000/api/customers
    // Get all customers
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getALLCustomers() {
        return customerService.getAllCustomers();
    }
    
    // localhost:49000/api/customers/{customerID}
    // Get customer by customerID    
    @GET
    @Path("/{customerID}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomer(@PathParam("customerID") int cust_ID) {
        return customerService.getCustomer(cust_ID);
    }
    
    // localhost:49000/api/customers 
    // with parameters specified in the body
    // Create a new customer
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Customer postCustomer(Customer c) {
	return customerService.createCustomer(c);
    }
    
    //to path to accounts (AccountsResources)
    @Path("/{customerID}/accounts")
    public AccountsResources getAccountResources(@PathParam("customerID") int cust_ID) {
	System.out.println("Getting accounts subresources...");
	return new AccountsResources();
    }
    
    
    //add more PUT, PATCH ect.
}