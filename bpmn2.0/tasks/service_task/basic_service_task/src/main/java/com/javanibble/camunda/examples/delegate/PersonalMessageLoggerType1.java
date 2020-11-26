package com.javanibble.camunda.examples.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PersonalMessageLoggerType1 implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(PersonalMessageLoggerType1.class.getName());

    public void execute(DelegateExecution execution) throws Exception {
        String message = (String) execution.getVariable("personal-message");

        LOGGER.info("PersonalMessageLoggerType1: " + message);

        execution.setVariable("personal-message", message);

    }

}
