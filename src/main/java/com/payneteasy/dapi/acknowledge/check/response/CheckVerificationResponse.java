package com.payneteasy.dapi.acknowledge.check.response;

import com.payneteasy.dapi.acknowledge.general.VerOutConsumer;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * Class is uses for security purposes and allows PaynetEasy to compare the data sent by Merchant’s app
 * with the data stored on Merchant’s server through check-verification operations. Merchant's acknowledge server
 * should respond to PaynetEasy with current structure.
 */
public class CheckVerificationResponse extends AbstractCheckResponse {
    private Billing billing;
    private VerOutConsumer consumer;

    private CheckVerificationResponse(){}

    public CheckVerificationResponse(Throwable e, String orderId){
        super(e, orderId);
    }

    @Valid
    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    @Valid
    public VerOutConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(VerOutConsumer consumer) {
        this.consumer = consumer;
    }

    public boolean hasConsumer() {
        return consumer != null;
    }

    /**
     * Billing info about consumer
     */
    public static class Billing{
        private DapiAddress address;
        private String phone;

        @Valid
        public DapiAddress getAddress() {
            return address;
        }

        public void setAddress(DapiAddress address) {
            this.address = address;
        }

        @Size(min = 1, max = 20)
        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public static class DapiAddress{

            private String city;
            private String country;
            private String postcodeZip;
            private String state;
            private String street;
            private String street2;

            @Size(min = 1, max = 100)
            public String getCity() {
                return city;
            }

            @Size(min = 3, max = 3)
            public String getCountry() {
                return country;
            }

            @Size(min = 1, max = 10)
            public String getPostcodeZip() {
                return postcodeZip;
            }

            @Size(min = 2, max = 2)
            public String getState() {
                return state;
            }

            @Size(min = 1, max = 50)
            public String getStreet() {
                return street;
            }

            @Size(min = 1, max = 50)
            public String getStreet2() {
                return street2;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public void setPostcodeZip(String postcodeZip) {
                this.postcodeZip = postcodeZip;
            }

            public void setState(String state) {
                this.state = state;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public void setStreet2(String street2) {
                this.street2 = street2;
            }
        }
    }
}
