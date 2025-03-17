# Project Setup and Running Locally

<h3>API Endpoints</h3>

- POST /    (create training center)
- GET /     (get training center)

<h3>Implemented</h3>

- create both api
- Implement a custom exception handler
- Swagger API documentation

<h3>Prerequisites</h3>

1) dependency 
- Spring Web 
- Spring Jpa
- Spring MySQL
- Lombok
- Validator

<h3>Springboot version</h3>

- 3.4.3

<h3>Java version</h3>
- 17


<h3>Configure the Database</h3>

 - create training_db database in your MySQL

- Update src/main/resources/application.properties with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/training_db
spring.datasource.username=<your database username>
spring.datasource.password=<your database password>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
```


<h3>Build and Run the Project</h3>
- Open and Run project on Intellij.

<h3>localhost start on:</h3>
- Server running on Port 8082.
- If you want to change port then Change it in application.properties.

<h3>Swagger Screenshot:</h3>

Swagger Url - http://localhost:8082/swagger-ui/index.html#/

![Screenshot 2025-03-17 105118](https://github.com/user-attachments/assets/799c67b3-6156-4f9a-8eea-7e98e5370cf0)

