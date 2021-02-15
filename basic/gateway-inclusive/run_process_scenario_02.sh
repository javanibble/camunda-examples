curl --location --request POST 'http://localhost:8080/rest/process-definition/key/place-order-process/start' --header 'Content-Type: application/json' --data-raw '{
  "variables": {
    "orderedCoffee": {
      "value": "false",
      "type": "boolean"
    },
      "orderedMuffin": {
        "value": "true",
        "type": "boolean"
    }
  }
}'
