🚀 UC2: Implement Logging with SLF4J in Spring Boot

This guide helps you add logging to your Spring Boot application using SLF4J (Simple Logging Facade for Java). Logging is essential for tracking application behavior and debugging issues.
📌 Project Details

Project Name    ➡️  spring-basics

Group ID        ➡️  com.springconcepts

Artifact ID	    ➡️  spring-basics

Package Name    ➡️  com.springconcepts.basics

Java Version    ➡️  17 or 21

Build Tool      ➡️  Maven

Dependencies	Spring Web, Spring Boot DevTools

✅ Steps to Set Up the Project

1️⃣ Create a Spring Boot Project using Spring Initializr.

2️⃣ Import the project into IntelliJ IDEA.

3️⃣ Ensure required dependencies are present in pom.xml.

4️⃣ Run the application using:

mvn spring-boot:run

5️⃣ Verify that the application starts successfully.

✅ How to Run the Application?

Open the terminal in IntelliJ IDEA and run:

mvn spring-boot:run

If using IntelliJ, you can also run SpringbasicsApplication.java directly.

=======
Project Name	➡️  spring-basics

Group ID		➡️  com.springconcepts

Artifact ID		➡️  spring-basics

Java Version	➡️  17 or 21

Build Tool	Maven

Dependencies	Spring Web, SLF4J (Logging)

✅ Steps to Implement Logging

1️⃣ Create a new branch for UC2 to keep changes separate.

2️⃣ Ensure SLF4J is included in the project dependencies.

3️⃣ Create a controller to handle API requests and log messages at different levels (INFO, DEBUG, WARN, ERROR).

4️⃣ Customize logging levels in the application properties file to control log verbosity.

5️⃣ Run and test the application using a browser, Postman, or cURL.

6️⃣ Check the logs in the terminal or the generated log file.

7️⃣ Commit and push changes to the UC2 branch.

8️⃣ Create a pull request and merge into the main branch after successful testing.

🎯 How to Test the Logging API?

Start the application and access the endpoint:

http://localhost:8080/api/log

