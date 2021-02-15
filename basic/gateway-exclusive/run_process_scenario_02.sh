curl --location --request POST 'http://localhost:8080/rest/process-definition/key/order-coffee/start' --header 'Content-Type: application/json' --data-raw '{
     "variables": {
         "order": {
             "value": "Caffe Mocha",
             "type": "String"
        }
    }
}'
