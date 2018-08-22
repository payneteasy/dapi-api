package com.payneteasy.dapi.acknowledge.general;

public class InCardReference {

    /**
     * This ID uses in Merchant's system for mapping card data source to unique ID in PaynetEasy
     */
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
