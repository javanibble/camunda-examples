package com.javanibble.camunda.examples;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("taskexecutionlistener")
public class TaskExecutionListener implements ExecutionListener {

    private final Logger LOGGER = LoggerFactory.getLogger(TaskExecutionListener.class.getName());

    public void notify(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info(delegateExecution.getCurrentActivityName());
    }
}
