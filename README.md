# Spring + GraphQL playground
## Running
### Linux
Open the terminal in the repository root folder, and then execute the following command:
```shell
./mvnw spring-boot:run
```
PS.: if you face permission issues, just run the command bellow, and then run the command above after again.
```shell
chmod +x mvnw
```
### Windows
Open the terminal in the repository root folder, and then execute the following command:
```shell
.\mvnw.cmd spring-boot:run
```
PS.: if you face permission issues, just run the terminal as administrator and you'll be good to go. 😃
## Requesting
### Query arguments

| Argument | Type   | Description                             |
|----------| ------ | --------------------------------------- |
| `name`   | String | The name of the person to greet. (Required) |
### Using GraphiQL
Go to https://localhost:8080/graphiql
#### Request body example
```graphql
{
  greet(name: "Mayra") {greeting}
}
```
#### Response example
```json
{
  "data": {
    "greet": {
      "greeting": "Hello, Mayra"
    }
  }
}
```
### Using cURL
#### Request example
```bash
curl -X POST http://localhost:8080/graphql \                                                           ─╯
  -H "Content-Type: application/json" \
  --data '{ "query": "{ greet(name: \"Mayra\") { greeting } }" }' | jq .
```
### Response example
```json
{
  "data": {
    "greet": {
      "greeting": "Hello, João"
    }
  }
}
```
Note: You need to have both cURL and jq to run the above commands. If you don't, you can install with the following command:
```shell
sudo apt update && sudo apt install -y curl jq
```
References:
- [Docs](https://spring.io/guides/gs/graphql-server)
- [Intro to GraphQL with Spring Boot](https://medium.com/simform-engineering/intro-to-graphql-with-spring-boot-e141fe54170c)
