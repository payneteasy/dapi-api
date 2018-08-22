package com.payneteasy.dapi.acknowledge.general;

import javax.validation.constraints.Size;

public class OutConsumer {

    /**
     * Consumer's email
     */
    private String email;

    @Size(min = 3, max = 128)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
