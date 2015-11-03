package com.bizify.attandance.resources;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.bizify.attandance.beans.MessageBean;
import com.bizify.attandance.results.MessageResult;
import com.bizify.rodin.rest.BaseResource;
import com.bizify.rodin.rest.Response;

@Component
@Path("/messages")
public class MessageResource extends BaseResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response<MessageBean> message(@PathParam("id") String id) {

        MessageResult result = MessageResult.builder().withData(new MessageBean("10", "hello world")).build();
        Response<MessageBean> response = Response.builder().withResult(result).build();

        return response;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response<MessageBean> messages() {

        MessageResult result = MessageResult.builder().withData(new MessageBean("10", "hello world")).build();
        Response<MessageBean> response = Response.builder().withResult(result).build();

        return response;
    }
}
