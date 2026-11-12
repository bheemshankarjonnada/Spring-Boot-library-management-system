📚 Spring Boot Library Management System
A RESTful Library Management System developed using Spring Boot, Spring Data JPA, Hibernate, and MySQL. The application provides APIs to manage book records and supports complete CRUD operations with custom exception handling.

🚀 Features
Add a new book
View all books
View a book by ID
Update book details
Delete a book
Custom exception handling for unavailable books
MySQL database integration
RESTful API architecture
🛠️ Tech Stack
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL
Maven
Postman
Git & GitHub
📂 Project Structure
src/main/java
│
├── Controller
│   └── BookController
│
├── Service
│   └── BookService
│
├── Repository
│   └── BookRepository
│
├── Entity
│   └── Book
│
├── Exception
│   ├── BookNotFoundException
│   └── GlobalExceptionHandler
│
└── LibraryManagementApplication
📖 API Endpoints
Create Book
POST /books
Get All Books
GET /books
Get Book By ID
GET /books/{bookId}
Update Book
PUT /books
Delete Book
DELETE /books/{bookId}
⚙️ Database Configuration
Configure MySQL settings inside:

application.properties
Example:

spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
🧪 Testing
All APIs were tested using Postman.

🎯 Learning Outcomes
Implemented MVC Architecture
Developed REST APIs using Spring Boot
Performed CRUD operations using Spring Data JPA
Integrated MySQL database with Hibernate ORM
Implemented Global Exception Handling using @RestControllerAdvice
Used Optional and Custom Exceptions for error handling
Practiced API testing with Postman
👨‍💻 Author
Jonnada Bheem Shankar

Aspiring Java Backend Developer
