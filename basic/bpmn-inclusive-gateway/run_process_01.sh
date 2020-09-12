curl --location --request POST 'http://localhost:8080/rest/process-definition/key/battleplan/start' --header 'Content-Type: application/json' --data-raw '{
     "variables": {
         "user": {
             "value": "Andre",
             "type": "String"
        }
    }
}'
