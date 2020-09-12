curl --location --request POST 'http://localhost:8080/rest/process-definition/key/approve_application_scenario_02/start' --header 'Content-Type: application/json' --data-raw '{
     "variables": {
         "applicant": {
             "value": "Andre",
             "type": "String"
        }
    }
}'
