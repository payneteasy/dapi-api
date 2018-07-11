package com.payneteasy.dapi.acknowledge.general.card;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

public class SourceCardNoSecurityCode extends AbstractCard {
    private Expiry expiry;
    private Holder holder;

    @NotNull
    @Valid
    @XmlElement(required = true)
    public Expiry getExpiry() {
        return expiry;
    }

    public void setExpiry(Expiry expiry) {
        this.expiry = expiry;
    }

    @NotNull
    @Valid
    @XmlElement(required = true)
    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public boolean hasExpiry() {
        return expiry != null;
    }

    public boolean hasHolder() {
        return holder != null;
    }
}
