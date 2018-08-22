package com.payneteasy.dapi.acknowledge.cardref.request;

public class ServerCardReference {

    /**
     * This ID uses in PaynetEasy for mapping card data source to ID in Merchant's system
     */
    private String serverCardId;

    /**
     * Unique card ID that uses for info only
     */
    private long uniqueReferenceCardId;

    public ServerCardReference() {
    }

    public ServerCardReference(String serverCardId, long uniqueReferenceCardId) {
        this.serverCardId = serverCardId;
        this.uniqueReferenceCardId = uniqueReferenceCardId;
    }

    public String getServerCardId() {
        return serverCardId;
    }

    public void setServerCardId(String serverCardId) {
        this.serverCardId = serverCardId;
    }

    public long getUniqueReferenceCardId() {
        return uniqueReferenceCardId;
    }

    public void setUniqueReferenceCardId(long uniqueReferenceCardId) {
        this.uniqueReferenceCardId = uniqueReferenceCardId;
    }
}
