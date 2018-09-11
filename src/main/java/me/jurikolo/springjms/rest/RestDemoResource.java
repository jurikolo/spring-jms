package me.jurikolo.springjms.rest;

import me.jurikolo.springjms.model.DummyPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class RestDemoResource {
    private static final Logger logger = LoggerFactory.getLogger(RestDemoResource.class);

    @Autowired private JmsTemplate jmsTemplate;

    @GetMapping("/get")
    public ResponseEntity<?> get() {
        logger.info("GET received from REST");
        jmsTemplate.convertAndSend("getQueue", me.jurikolo.springjms.model.Dummy.class);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity post(@RequestBody DummyPost dummyPost) {
        logger.info("POST received from REST with ID: " + dummyPost.getId());
        jmsTemplate.convertAndSend("postQueue", dummyPost);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
