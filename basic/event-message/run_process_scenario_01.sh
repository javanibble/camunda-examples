#!/bin/bash

echo "Scenario 1: User Task 1 --> Interrupted --> User Task 1A"

echo Message Event Process: Start Process
curl --location --request POST 'http://localhost:8080/rest/message' --header 'Content-Type: application/json' --data-raw '{
     "messageName": "message-start-event",
     "businessKey": "process-key-123"
}'
sleep 5

echo Message Event Process: Interrupting User Task 1
curl --location --request POST 'http://localhost:8080/rest/message' --header 'Content-Type: application/json' --data-raw '{
     "messageName": "message-boundary-event",
     "businessKey": "process-key-123"
}'

sleep 5

echo Message Event Process: Complete User Task 1A
IP=$(curl --location --fail --silent --request POST 'http://localhost:8080/rest/task' --header 'Content-Type: application/json' --data-raw '{ "processInstanceBusinessKey": "process-key-123", "taskDefinitionKey": "user-task-1a"}' | jq -r '.[0].id')

curl --location --fail --silent --request POST "http://localhost:8080/rest/task/$IP/complete" --header 'Content-Type: application/json'

