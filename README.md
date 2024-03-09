- If you are using Windows Command Prompt to issue cURL commands, chances are the below command won’t work properly. 
- You must either pick a terminal that support single quoted arguments, or use double quotes and then escape the ones 
   inside the JSON.


- CURL for POST without escape.

  -     $ curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'

- Escaped - Cmder Windows
  
  -     λ curl -X POST localhost:8080/employees -H "Content-type:application/json" -d "{\"name\": \"Samwise Gamgee\", \"role\": \"gardener\"}"





- Spring REST, JPA, H2
- CRUD, POST with multiple consume
- OrElseThrow, orElseGet with @PUT
- Custom Exception with Advice(to throw a 404 with a message in the RequestBody)
- HATEOS Hypermedia to make the API Restfull


- CV

A lot of APIs creators think by following the URI standars and by using GET/POST that makes they API Restfull.
In fact those APIs can be called:  RPC (Remote Procedure Call).

One of thing that can be introduced to make your API Restfull is to add hypermedia or HATEOS
Basically adding  links to relevant operations. Typically the client are given the entry point of an API and from there they can navigate all the operations bythemselves.
you can implement it manually but with spring it is better to add a dependency