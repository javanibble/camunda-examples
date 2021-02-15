package com.javanibble.camunda.examples;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("logger")
public class ConsoleLoggerDelegate implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(ConsoleLoggerDelegate.class.getName());

    public void execute(DelegateExecution execution) throws Exception {
        String activityId = execution.getCurrentActivityId();

        if ("retrieve-coffee-order".equals(activityId)) {
            LOGGER.info("Order Coffee Process: Retrieve Coffee Order");

        } else if ("make-coffee".equals(activityId)) {
            LOGGER.info("Order Coffee Process: Make Coffee");

        } else if ("retrieve-cup-saucer".equals(activityId)) {
            LOGGER.info("Order Coffee Process: Retrieve Cup & Saucer");

        } else if ("pour-coffee-in-cup".equals(activityId)) {
            LOGGER.info("Order Coffee Process: Pour Coffee in Cup");

        } else if ("deliver-coffee-order".equals(activityId)) {
            LOGGER.info("Order Coffee Process: Deliver Coffee Order");

        } else {
            LOGGER.info("Something went wrong !!!!");
        }
    }

}
