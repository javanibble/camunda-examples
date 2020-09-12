package com.javanibble.camunda.examples;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityBehavior;
import org.camunda.bpm.engine.impl.pvm.delegate.ActivityExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component("battleplanDecision")
public class BattleplanDecisionDelegate implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(ConsoleLoggerDelegate.class.getName());


    public void execute(DelegateExecution execution) throws Exception {
        Random randomApproval = new Random();

        LOGGER.info("Create battleplan for : " + execution.getVariable("user"));

        execution.setVariable("isAttackNorth", randomApproval.nextBoolean());
        execution.setVariable("isAttackSouth", randomApproval.nextBoolean());

    }

}
