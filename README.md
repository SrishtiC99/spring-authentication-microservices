## Jwt Authentication SpringBoot
## Microservices Architecture
### Service Registry
```
Register all the microservices on eureka server
```

### Api Gateway
```
Runs on port 8080. Forward all the api requests from user to the destination microservice.
Filter all the http requests using Authorization token. 
```

### Auth Service
```
Handle user registration, Token generation and Token validation. 
Use JwtService for authentication and mysql db to store user credential.
```

### Customer Service & Admin Service
```
User access these services using api-gateway after authenticated to auth-service.
```