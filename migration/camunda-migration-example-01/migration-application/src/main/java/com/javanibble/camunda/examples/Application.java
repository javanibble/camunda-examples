package com.javanibble.camunda.examples;


import com.javanibble.camunda.examples.processmigration.UpgradeMainFromV1ToV2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  private static Logger LOG = LoggerFactory.getLogger(Application.class);

  @Autowired
  private UpgradeMainFromV1ToV2 processMigration;

  public static void main(String[] args) {
    SpringApplication.run(Application.class);
  }

  @Override
  public void run(String... args) {
    LOG.info("Starting the migration process.");

    processMigration.run();

    LOG.info("Migration process completed.");
  }

}