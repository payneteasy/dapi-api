package com.payneteasy.dapi.acknowledge.general;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class VerOutConsumer extends OutConsumer {
    private String birthDay;
    private List<String> ipAddresses = new ArrayList<String>();

    @Size(min = 8, max = 8)
    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Valid
    @Size(max = 10)
    public List<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }
}
