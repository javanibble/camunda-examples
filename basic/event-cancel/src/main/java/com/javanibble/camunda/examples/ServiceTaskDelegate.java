package com.javanibble.camunda.examples;


import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("servicetaskdelegate")
public class ServiceTaskDelegate implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(ServiceTaskDelegate.class.getName());

    public void execute(DelegateExecution execution) throws Exception {
        String breakingTask = (String) execution.getVariable("breakingTask");
        if (execution.getCurrentActivityId().equals(breakingTask)) {
            LOGGER.info(execution.getCurrentActivityName() + " Failure");
            throw new BpmnError(breakingTask + " is breaking !!!!");
        }
        LOGGER.info(execution.getCurrentActivityName() + " Success");
    }

}
