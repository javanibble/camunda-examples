curl --location --request POST 'http://localhost:8080/engine-rest/process-definition/key/cancel-event-process/start' --header 'Content-Type: application/json' --data-raw '{
  "variables": {
    "breakingTask": {
      "value": "task_charge_credit_card",
      "type": "String"
    }
  }
}'