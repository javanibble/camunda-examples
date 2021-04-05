# Camunda Example: Implement a BPMN Manual Task in Camunda

## Quick Summary
The article contains a step-by-step guide on how to implement a BPMN Manual Task in Camunda making use of a Spring Boot Application. Camunda BPM is an open-source workflow and decision automation platform.

To view the online article, please visit [JavaNibble](https://www.javanibble.com/implement-bpmn-manual-task-in-camunda/)

## Compile & Run The Example

### 1. Compile the application
The following commands show you how to compile the application from the command line:

```shell
$ mvn clean install
```

### 2. Run the application
After you have successfully built the Camunda BPM Spring Boot application, the compiled artifact can be found in the target directory. Use the following command to start the Camunda BPM Spring Boot Application.

```shell
$ maven spring-boot:run
```

### 3. Execute the example
Once the application starts, run the following command in another terminal to send a message to the Spring Boot application.

```shell
$ curl --location --request POST 'http://localhost:8080/rest/process-definition/key/order-coffee/start' --header 'Content-Type: application/json'
``` 

## Finally
Congratulations !!! You have successfully implemented a BPMN Manual Task in Camunda making use of a Spring Boot Application.