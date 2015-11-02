package com.bizify.attandance.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.bizify.attandance.criteria.MessageCriteria;

@Component
@Path("/")
public class HelloWorldResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello")
    public Response sayHello() {
        return Response.ok().entity(new MessageCriteria("hello")).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/hello")
    public Response sayHi(MessageCriteria criteria) {
        return Response.ok().entity(criteria).build();
    }
}
