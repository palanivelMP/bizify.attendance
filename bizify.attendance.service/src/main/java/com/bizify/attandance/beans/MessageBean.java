package com.bizify.attandance.beans;

import com.bizify.rodin.rest.DataTransfer;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("message")
public class MessageBean extends DataTransfer {
    private static final long serialVersionUID = -8782983642690176663L;
    
    private String id;
    private String name;

    public MessageBean() {}

    public MessageBean(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
