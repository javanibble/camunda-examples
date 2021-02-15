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

        if ("place-order".equals(activityId)) {
            LOGGER.info("Place Order Process: Place Order");

        } else if ("make-coffee".equals(activityId)) {
            LOGGER.info("Place Order Process: Make Coffee");

        } else if ("warm-up-muffin".equals(activityId)) {
            LOGGER.info("Place Order Process: Warm Up Muffin");

        } else if ("give-free-sample".equals(activityId)) {
                LOGGER.info("Place Order Process: Give Free Sample");

        } else if ("deliver-order".equals(activityId)) {
            LOGGER.info("Place Order Process: Deliver Order");

        } else {
            LOGGER.info("Something went wrong !!!!");
        }
    }

}
