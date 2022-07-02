# Movies Review API Authentication
This project is a REST API authentication service for the [Movies Review API]([https://github.com/gabrieloswaldo/movies-review-api) (see documentation).

The authentication is done through the endpoint with email and password. The service will validate the user's email and password in the same database, then return a JWT token, which will be returned to the user and used later for endpoints authorization.

## Execution

### Prerequisites
- Java 11

### Step by step
Follow this step by step to run the application (start at the project root directory):
- Clone this project;
- Import it as a Maven project into your IDE;
- Run the database container inside the [Movies Review API]([https://github.com/gabrieloswaldo/movies-review-api);
- Run the _MoviesReviewAuthApplication_ class.

## API documentation
This is a summary of the application endpoints. They can be tested using [Postman](https://www.postman.com/) by importing the collection available into the `postman` directory at the project root.

### POST - `http://localhost:8081/api/v1/auth`
Send a POST request with `Content-Type` `application/json` to this endpoint with a body as the following:
```json
{
    "email": "teste@email.com",
    "password": "123456"
}
```

## Features to be implemented
Finally, some features were not implemented and may be added in the future:
- Add API Swagger documentation;
- Add caching.
