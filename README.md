# Source: https://spring.io/guides/tutorials/rest
- If you are using Windows Command Prompt to issue cURL commands, chances are the below command won’t work properly. 
- You must either pick a terminal that support single quoted arguments, or use double quotes and then escape the ones 
   inside the JSON.


- CURL for POST without escape.

  -     $ curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'

- Escaped - Cmder Windows
  
  -     λ curl -X POST localhost:8080/employees -H "Content-type:application/json" -d "{\"name\": \"Samwise Gamgee\", \"role\": \"gardener\"}"
