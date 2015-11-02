package com.bizify.attandance;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.bizify.attandance.resources.HelloWorldResource;
import com.bizify.rodin.rest.provider.ObjectMapperContextResolver;

@Configuration
@ApplicationPath("/attendance-api/v1")
public class AttendanceConfiguration extends ResourceConfig {
    public AttendanceConfiguration() {
        init();
    }

    private void init() {
        register(new ObjectMapperContextResolver());     
        packages("com.bizify.attendance.resources");
        register(HelloWorldResource.class);
        register(JacksonFeature.class);
    }
}
