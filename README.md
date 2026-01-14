🚀 Key Features :-
-------------------------
✅ Create, Read, Update, Delete (CRUD) operations on employees

✅ Spring Boot MVC architecture (Controller, Service, Repository)

✅ Thymeleaf-based dynamic frontend UI

✅ Oracle Database integration using Spring Data JPA

✅ Hibernate auto table creation & entity mapping

✅ Clean and professional UI design

✅ Server-side form validation & data binding

✅ Production-ready project structure

🛠️ Technology Stack :-
------------------------
Layer	Technology
Backend	Java 17, Spring Boot
ORM	Spring Data JPA (Hibernate)
Frontend	Thymeleaf, HTML, CSS
Database	Oracle Database
Build Tool	Maven
Server	Embedded Tomcat
Version Control	Git & GitHub


🗄️ Database Details :-
---------------------------
Database: Oracle DB

ORM Tool: Hibernate

DDL Strategy: spring.jpa.hibernate.ddl-auto=update

Table auto-generated from JPA Entity

📂 Project Structure :-
--------------------------------

Employee_Management_System
│
├── controller
│   └── EmployeeController.java
│
├── service
│   ├── EmployeeService.java
│   └── EmployeeServiceImpl.java
│
├── repository
│   └── EmployeeRepository.java
│
├── entity
│   └── Employee.java
│
├── resources
│   ├── templates
│   │   ├── index.html
│   │   ├── new_employee.html
│   │   └── update_employee.html
│   │
│   ├── static
│   │   └── css/style.css
│   │
│   └── application.properties
│
└── pom.xml

🖥️ UI & Use Case Screenshots :-
-------------------------------
📋 Employee List – Home Page

➕ Add Employee – Form Submission

✏️ Update Employee – Edit Existing Record

❌ Delete Employee – Remove Record


-----------------------------------------------------------------------------------------------------
▶️ How to Run the Project :-
----------------------------------
1️⃣ Clone the Repository
-------------------------
git clone https://github.com/<your-username>/Employee-Management-System.git

2️⃣ Navigate to Project
--------------------------
cd Employee-Management-System

3️⃣ Configure Database
---------------------------------------
Update application.properties:

server.port=9091

spring.datasource.url=jdbc:oracle:thin:@//HOST:PORT/SERVICE_NAME
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect

4️⃣ Run the Application
-----------------------------
mvn spring-boot:run

5️⃣ Open Browser
http://localhost:9091/
