curl --location --request POST 'http://localhost:8080/rest/message' --header 'Content-Type: application/json' --data-raw '{
  "messageName" : "secretmessage",
  "businessKey" : "myfirstgame"
}'