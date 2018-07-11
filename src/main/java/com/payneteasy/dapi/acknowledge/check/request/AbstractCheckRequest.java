package com.payneteasy.dapi.acknowledge.check.request;

import com.payneteasy.dapi.acknowledge.general.InConsumer;
import com.payneteasy.dapi.acknowledge.general.InSession;

public abstract class AbstractCheckRequest {
    private InConsumer consumer;
    private InSession session;

    public InConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(InConsumer consumer) {
        this.consumer = consumer;
    }

    public InSession getSession() {
        return session;
    }

    public void setSession(InSession session) {
        this.session = session;
    }
}
