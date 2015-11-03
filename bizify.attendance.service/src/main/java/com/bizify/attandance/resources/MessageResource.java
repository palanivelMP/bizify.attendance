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
    public Response<MessageBean> sayHello(@PathParam("id") String id) {
        Response<MessageBean> response = new Response<MessageBean>();
        MessageResult result = new MessageResult();
        result.setData(new MessageBean("10", "hello world"));
        return respond(response, result);
    }
}
