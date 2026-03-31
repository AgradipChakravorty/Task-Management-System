# Task-Management-System
Spring Boot REST API for Task Management with MySQL integration, supporting CRUD operations and JPA/Hibernate.

# Task Management System

This is a simple backend application built using Spring Boot that provides REST APIs to manage tasks. It supports basic operations like creating, updating, retrieving, and deleting tasks, and is connected to a MySQL database for persistence.

---

## What this project does

The application allows users to:

* Create new tasks
* View all tasks
* Get a task by ID
* Update existing tasks
* Delete tasks

It follows a standard layered structure with controller, service, and repository components.

---

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Maven

---

## Project Structure

```
src/
 └── main/
      ├── java/com/example/taskmanagementsystem/
      │     ├── controller/
      │     ├── service/
      │     ├── repository/
      │     └── entity/
      └── resources/
            └── application.properties
```

---

## How to run

1. Clone the repository:

```
git clone https://github.com/YOUR_USERNAME/Task-Management-System.git
cd Task-Management-System
```

2. Configure your database in:

```
src/main/resources/application.properties
```

Example:

```
spring.datasource.url=jdbc:mysql://localhost:3306/task_db
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=update
```

3. Run the application:

```
./mvnw spring-boot:run
```

Or run the main class from your IDE.

---

## API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| GET    | /tasks      | Get all tasks  |
| GET    | /tasks/{id} | Get task by ID |
| POST   | /tasks      | Create task    |
| PUT    | /tasks/{id} | Update task    |
| DELETE | /tasks/{id} | Delete task    |

---

## Notes

* Database credentials are handled using environment variables.
* The project is structured to keep code organized and easy to extend.

---

## Author

Agradip Chakravorty
