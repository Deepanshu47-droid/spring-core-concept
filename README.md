🚀 UC3: Dependency Injection with Employee and Department Beans

✅ This use case demonstrates Dependency Injection in a Spring Boot application using @Component and @Autowired.


📌 Project Overview

This project defines:

EmployeeBean ➝ Represents an Employee with a name and a department.

DepartmentBean ➝ Represents the Department of an Employee.

EmployeeController ➝ REST API to add and retrieve employee details.

Both beans are managed by Spring Container, and dependency injection is achieved using @Autowired.

⚙ Technologies Used

🔹 Spring Boot

🔹 Spring Core

🔹 Maven

🔹 REST APIs

📂 Project Structure

📦 com.springcoreconcepts.springbasics

 ┣ 📂 bean

 ┃ ┣ 📜 EmployeeBean.java

 ┃ ┣ 📜 DepartmentBean.java

 ┣ 📂 controller

 ┃ ┣ 📜 EmployeeController.java

 ┣ 📜 SpringBasicsApplication.java


🏗 Implementation Details

🔹 EmployeeBean.java

✔ Annotated with @Component

✔ Uses @Autowired to inject DepartmentBean


🔹 DepartmentBean.java

✔ Defines the Department Name

✔ Annotated with @Component


🔹 EmployeeController.java

✔ REST Controller to handle POST and GET requests

🌐 Testing the APIs

🛠 Using Postman or Browser

📌 1. Add Employee Details (POST Request)

URL: http://localhost:8080/employee/add

Method: POST

Body (JSON):

{
  "empName": "Raj",
  "department": {
    "deptName": "IT"
  }
}

Response:

✅ Employee details added successfully!


📌 2. Retrieve Employee Details (GET Request)

URL: http://localhost:8080/employee/details

Method: GET

Response:
{
  "empName": "Raj",
  "department": {
    "deptName": "IT"
  }
}

🏆 Key Takeaways

✅ Spring Boot manages Employee and Department objects

✅ Dependency Injection using @Autowired

✅ REST API Implementation with @RestController


🔹 Author: Deepanshu Malviya

🔹 Date: February 2025

🔥 Happy Coding! 🚀