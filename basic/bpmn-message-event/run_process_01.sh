curl --location --request POST 'http://localhost:8080/rest/message' --header 'Content-Type: application/json' --data-raw '{
  "messageName" : "message_start_event",
  "businessKey" : "myfirstmessage"
}'
