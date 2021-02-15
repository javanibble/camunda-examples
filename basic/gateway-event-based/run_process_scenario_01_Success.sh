curl --location --request POST 'http://localhost:8080/rest/message' --header 'Content-Type: application/json' --data-raw '{
     "messageName": "payment-successful-message",
     "businessKey": "business-key-123"
}'
