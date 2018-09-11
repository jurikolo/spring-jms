package me.jurikolo.springjms.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsDemoGetResource {
    private static final Logger logger = LoggerFactory.getLogger(JmsDemoGetResource.class);

    @JmsListener(destination = "getQueue")
    public void receiveGet() {
        logger.info("Received GET via JMS");
    }
}
