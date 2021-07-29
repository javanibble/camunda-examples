package com.javanibble.camunda.examples;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("executionlistener")
public class ExecutionListener implements org.camunda.bpm.engine.delegate.ExecutionListener {

    private final Logger LOGGER = LoggerFactory.getLogger(ExecutionListener.class.getName());

    public void notify(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info(delegateExecution.getCurrentActivityName());
    }
}
