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

        if ("submit-payment-request".equals(activityId)) {
            LOGGER.info("Payment Process: Submit Payment Request");

        } else if ("submit-timeout-reversal".equals(activityId)) {
            LOGGER.info("Payment Process: Submit Timeout Reversal");

        } else if ("print-payment-failure-receipt".equals(activityId)) {
            LOGGER.info("Payment Process: Print Payment Failure Receipt");

        } else if ("print-payment-receipt".equals(activityId)) {
            LOGGER.info("Payment Process: Print Payment Receipt");

        } else {
            LOGGER.info("Something went wrong !!!!");
        }
    }

}
