package com.javanibble.camunda.examples;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityBehavior;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component("approveApplication")
public class ApplicationApprovalDelegate implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(ConsoleLoggerDelegate.class.getName());


    public void execute(DelegateExecution execution) throws Exception {
        Random randomApproval = new Random();

        LOGGER.info("Approval Process Started for : " + execution.getVariable("applicant"));

        execution.setVariable("isApplicationApproved", randomApproval.nextBoolean());

    }

}
