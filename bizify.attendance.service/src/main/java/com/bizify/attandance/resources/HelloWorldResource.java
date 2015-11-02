package com.bizify.attandance.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldResource {
    @GET
    @Produces("application/json")
    @Path("/hello")
    public String health() {
        return "hello";
    }
}
