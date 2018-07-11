package com.payneteasy.dapi.acknowledge.general;

import javax.validation.constraints.NotNull;

public class OutSession {
    private String checkSignature;
    private String nonce;
    private String token;

    @NotNull
    public String getCheckSignature() {
        return checkSignature;
    }

    public void setCheckSignature(String checkSignature) {
        this.checkSignature = checkSignature;
    }

    @NotNull
    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    @NotNull
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
