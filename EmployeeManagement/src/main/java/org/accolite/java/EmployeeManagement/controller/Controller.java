package org.accolite.java.EmployeeManagement.controller;

import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.accolite.java.EmployeeManagement.dto.*;
import org.accolite.java.EmployeeManagement.services.*;







@Path("emp_list")
public class Controller {
	
	
	
	    /**
	     * Method handling HTTP GET requests. The returned object will be sent
	     * to the client as "text/plain" media type.
	     *
	     * @return String that will be returned as a text/plain response.
	     */
	static Employee_Services service = new Employee_Services();
	
	
	
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public List<Employee> getAll_() {
	        return service.getAll();
	    }
	    
	    
	    
	 //   @Path("update")
	  //  @Consumes({"application/xml", "application/json"})
	   // public String update(Employee temp) {
	   // System.out.println("Update Path "+temp.getName());
	   // return emp.updateEmployee(temp);
	  //  }
	    @Path("{id}")
	    @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Employee get(@PathParam("id") int id) {
	    return service.getById(id);
	    }
	    
	    
	    @POST
		@Path("update")
	    @Produces(MediaType.APPLICATION_JSON)
		@Consumes({"application/xml", "application/json"})
	    public Employee get_age(Employee emp)
	    
	    {
	    	return service.update(emp);
	    }
	    }
	    
	
