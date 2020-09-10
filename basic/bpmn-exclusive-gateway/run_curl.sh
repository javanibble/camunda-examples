curl --location --request POST 'http://localhost:8080/rest/process-definition/key/approve-application/start' --header 'Content-Type: application/json' --data-raw '{
     "variables": {
         "applicant": {
             "value": "Andre",
             "type": "String"
        }
    }
}'
