package com.payneteasy.dapi.acknowledge.general.card;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;

public class SourceCard extends SourceCardNoSecurityCode {

    /**
     * CVV/CVC2
     */
    private String securityCode;

    @NotNull
    @Size(min = 3, max = 4)
    @Digits(integer = 4, fraction = 0)
    @XmlElement(required = true)
    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
}
