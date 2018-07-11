package com.payneteasy.dapi.acknowledge.general;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class AbstractProxyErrorResponse implements IHasError{

    private Error error;

    AbstractProxyErrorResponse(){
    }

    AbstractProxyErrorResponse(Throwable e, String orderId){
        this.error = new Error(e, orderId);
    }

    public Error getError() {
        return error;
    }

    public static class Error{

        private String type;
        private String message;
        private String trace;
        private String orderId;

        Error(){}

        Error(Throwable e, String orderId){
            this.type = e.getClass().getName();
            this.message = e.getMessage();
            this.trace = Arrays.stream(e.getStackTrace()).map(StackTraceElement::toString).collect(Collectors.joining(System.lineSeparator()));
            this.orderId = orderId;
        }

        public String getOrderId() {
            return orderId;
        }

        public String getType() {
            return type;
        }

        public String getMessage() {
            return message;
        }

        public String getTrace() {
            return trace;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setTrace(String trace) {
            this.trace = trace;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }
    }

    @Override
    public boolean hasError() {
        return this.error != null;
    }
}
