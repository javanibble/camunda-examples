package com.code2bits.camunda.simplebpm;


import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;


@SpringBootApplication
@EnableProcessApplication
public class PersonalMessageApplication {


	@Autowired
	private RuntimeService runtimeService;


	public static void main(String[] args) {
		SpringApplication.run(PersonalMessageApplication.class, args);
	}


	@EventListener
	private void processPostDeploy(PostDeployEvent event) {
		runtimeService.startProcessInstanceByKey("personal_message");
	}

}