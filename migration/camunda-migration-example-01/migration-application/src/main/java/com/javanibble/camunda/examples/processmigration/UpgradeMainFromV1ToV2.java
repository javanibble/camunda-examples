package com.javanibble.camunda.examples.processmigration;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.migration.MigrationPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpgradeMainFromV1ToV2 {

    @Autowired
    private ProcessEngine processEngine;

    @Autowired
    private RuntimeService runtimeService;


    public void run() {

        MigrationPlan migrationPlan = processEngine.getRuntimeService()
                .createMigrationPlan("personal-message:2:f2a0b812-f8cb-11ea-a297-acde48001122", "personal-message:3:9eeab542-f8cc-11ea-92ed-acde48001122")
                .mapEqualActivities()
//                .mapActivities("user_task_personal_message_joe", "user_task_personal_message_joe")
//                .mapActivities("user_task_personal_message_peter", "user_task_personal_message_peter")
                .build();

        runtimeService
                .newMigration(migrationPlan)
                .processInstanceIds("d7aead94-f8cb-11ea-b684-acde48001122", "ce1c92fa-f8cb-11ea-b684-acde48001122")
                .execute();

    }

}
