package com.payneteasy.dapi.acknowledge.cardref.request;

public class ServerCardReference {
    private String serverCardId;
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
