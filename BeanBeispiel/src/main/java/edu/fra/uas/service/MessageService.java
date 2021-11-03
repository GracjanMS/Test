package edu.fra.uas.service;


import org.springframework.stereotype.Component;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ch.qos.logback.classic.Logger;

@Component
public class MessageService {

    private int counter = 0;


    private static final Logger log = (Logger) LoggerFactory.getLogger(MessageService.class);

    private String message;

    public String getMessage() {
        log.debug(message);

        return message;
    }

    public void setMessage(String message) {
        log.debug(message);
        this.message = message;
    }

    public int increment() {
        counter = counter + 1;

        return counter;
    }


}
