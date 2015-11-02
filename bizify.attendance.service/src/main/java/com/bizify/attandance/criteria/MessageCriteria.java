package com.bizify.attandance.criteria;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageCriteria {
    @JsonProperty("message")
    private String message;
    
    public MessageCriteria() {     
    }

    
    public MessageCriteria(@JsonProperty("message") String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
