package com.foodtrucks.rest.resource.impl;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foodtrucks.rest.domain.FoodTruck;
import com.foodtrucks.rest.resource.FoodTruckResource;
import com.foodtrucks.rest.service.FoodTruckService;


//@Component
@Path("/foodtruckmethods")
//@Scope("request")
public class FoodTruckResourceImpl implements FoodTruckResource{
	
	static final Logger logger = LoggerFactory.getLogger(FoodTruckResourceImpl.class);
	
	@Autowired  private FoodTruckService foodTruckService;
	
	@Context
	private UriInfo uriInfo;
	
	@GET
	@Path("/hello")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	  }
	
	@GET
	@Path("/{parameter}")
	public Response responseMsg( @PathParam("parameter") String parameter,
			@DefaultValue("Nothing to say") @QueryParam("value") String value) {

		String output = "Hello from: " + parameter + " : " + value;

		return Response.status(200).entity(output).build();
	}
	
	@GET 
    //@Produces({ "application/json"})
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<FoodTruck> findAllFoodTrucks() {
    	List<FoodTruck> results = foodTruckService.findAllFoodTrucks();
        /*Required in case its unable to marshal JSON/xml response. Making Person class @XmlRootElement annotated resolves the issue
          return Response.ok(results).build();
    	  return Response.created(uriInfo.getAbsolutePath()).entity((Person)results.get(0)).build();*/
    	return results;
    }


	@GET @Path("search/{query}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<FoodTruck> findByName(@PathParam("query") String query) {
		logger.info("Finding foodtrucks by name: " + query);
		return foodTruckService.findByName(query);
	}

	@GET @Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public FoodTruck findById(@PathParam("id") long id) {
		logger.info("Finding foodtrucks by id: " + id);
		return foodTruckService.findById(id);
	}



	public FoodTruck create(FoodTruck FoodTruck) {
		// TODO Auto-generated method stub
		return null;
	}

	public FoodTruck update(FoodTruck FoodTruck) {
		// TODO Auto-generated method stub
		return null;
	}

	public FoodTruck delete(FoodTruck FoodTruck) {
		// TODO Auto-generated method stub
		return null;
	}

}
