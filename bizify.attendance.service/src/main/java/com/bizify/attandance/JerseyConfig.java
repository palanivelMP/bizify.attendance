package com.bizify.attandance;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.bizify.attandance.resources.HelloWorldResource;

@Configuration
@ApplicationPath("/attendance-api/v1")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(HelloWorldResource.class);
    }
}
