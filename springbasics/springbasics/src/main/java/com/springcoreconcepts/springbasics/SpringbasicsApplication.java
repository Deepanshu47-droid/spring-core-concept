package com.springcoreconcepts.springbasics;

import com.springcoreconcepts.springbasics.bean.EmployeeBean;
import com.springcoreconcepts.springbasics.controller.LoggingController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbasicsApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbasicsApplication.class);

	public static void main(String[] args) {
		logger.info("🚀 Application Starting...");
		ConfigurableApplicationContext context = SpringApplication.run(SpringbasicsApplication.class, args);
		logger.info("✅ Application Started Successfully!");

		// UC3: Dependency Injection Demonstration
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		employee.showEmployeeDetails();

		// UC2: Logging Feature Demonstration
		LoggingController loggingController = context.getBean(LoggingController.class);
		loggingController.logMessage();
	}
}
