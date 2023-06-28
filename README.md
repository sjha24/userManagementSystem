# User Management System Validations
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This project is a Managing User data built using Spring Boot with Java.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>The User data model is defined in the User class, which has the following attributes:
```
userID : unique identifier for each user(and should not be Empty).
userName : name of the user(should not be Blank).
dateOfBirth : DOB of user(Date of birth should be in the format yyyy-MM-dd).
email : Email of user (accepts only valid email).
phoneNumber : Phone Number of user(Phone number should be in the format XX-XXXXXXXXXX).
date : User Registered date (Date should be in format dd/mm/yyyy).
time : Registered time of User(time should be in the format HH:mm:ss).
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used 

* GetMaping/user/{ID}
```
This endpoint returns data of specific user based on userId through API.
```
* GetMaping/users
```
This endpoint makes a call to method in UserService class which retrieves data of all users from database through API.
```
*PostMaping/user
```
This endpoint makes a call to method in UserService class which is connected to database. In database we add a new user given through API.
```
*PutMapping/user/update/{ID}
```
This endpoint makes a call to method in UserService class which is connected to database. In database we update and validate a user by userid given through API.
```
*DeleteMapping/user/remove
```
This endpoint makes a call to method in UserService class which is connected to database. In database we delete a user by UserId given through API.
```
## Data Structure Used
* ArrayLiSt
```
We have used ArrayList data structure as a database to get, add and update Users data in database .
```

## Project Summary
```
This project is a user management system implemented using the Spring framework. It provides endpoints for adding, retrieving, updating, and deleting user information. The user model includes attributes such as userId, username, dateOfBirth, email, phoneNumber, date, and time. The project uses Spring Validation API to validate the fields in the User model, including @NotNull, @NotEmpty, @NotBlank , @Email, @Pattern, and @DateTimeFormat annotationsand Custom validations .
```
## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license
