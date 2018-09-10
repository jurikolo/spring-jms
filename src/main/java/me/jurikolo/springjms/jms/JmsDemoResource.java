package me.jurikolo.springjms.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsDemoResource {

    @JmsListener(destination = "getQueue")
    public void receiveGet() {
        System.out.println("Received GET via JMS");
    }
}
