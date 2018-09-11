package me.jurikolo.springjms.jms;

import me.jurikolo.springjms.model.DummyPost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsDemoPostResource {
    private static final Logger logger = LoggerFactory.getLogger(JmsDemoPostResource.class);

    @JmsListener(destination = "postQueue")
    public void receivePost(DummyPost dummyPost) {
        logger.info("Received POST from JMS with ID: " + dummyPost.getId());
    }
}
