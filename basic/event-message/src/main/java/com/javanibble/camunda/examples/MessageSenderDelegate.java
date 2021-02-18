package com.javanibble.camunda.examples;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("messageSender")
public class MessageSenderDelegate implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(MessageSenderDelegate.class.getName());

    public void execute(DelegateExecution execution) throws Exception {
            LOGGER.info("Message Event Process: Sending Message");
    }



}
