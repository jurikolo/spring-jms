package me.jurikolo.springjms.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class RestDemoResource {

    @Autowired private JmsTemplate jmsTemplate;

    @GetMapping("/get")
    public void get() {
        System.out.println("GET received");
        jmsTemplate.convertAndSend("getQueue", me.jurikolo.springjms.model.Dummy.class);
    }

}
