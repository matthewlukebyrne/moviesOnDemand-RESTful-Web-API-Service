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

//Main objective is to:
// Get a customer: GET localhost:49000/api/customers
// Get all accounts associated with a customer: GET localhost:49000/api/customers/1/accounts
// Get all the movies assiciated with an account: GET localhost:49000/api/customers/1/accounts/1/movies
// Get all the watched movies assiciated with an account: GET localhost:49000/api/customers/1/accounts/1/movies?organized=watched
// Get all the recommended movies assiciated with an account: GET localhost:49000/api/customers/1/accounts/1/movies?organized=recommended
// Create a new account: POST localhost:49000/api/customers/1/accounts?nickname=bob&password=1234
// 

@Path("/customers")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

public class CustomersResources {

    CustomerService customerService = new CustomerService();
   
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Customer> getALLCustomersXML() {
        return customerService.getAllCustomers();
    }
        
    @GET
    @Path("/{CustomerID}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomer(@PathParam("CustomerID") int customerID) {
        return customerService.getCustomer(customerID);
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
    /*
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
    }*/
    
    
    //add more PUT, PATCH ect.
}