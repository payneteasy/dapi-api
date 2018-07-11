package com.payneteasy.dapi.acknowledge.general;

public class InCardReference {
    private String clientCardId;

    public InCardReference(String clientCardId) {
        this.clientCardId = clientCardId;
    }

    public InCardReference() {
    }

    public String getClientCardId() {
        return clientCardId;
    }

    public void setClientCardId(String clientCardId) {
        this.clientCardId = clientCardId;
    }
}
