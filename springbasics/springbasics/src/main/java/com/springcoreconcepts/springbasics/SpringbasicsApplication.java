package com.springcoreconcepts.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbasicsApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbasicsApplication.class);

	public static void main(String[] args) {
		logger.info("🚀 Application Starting...");
		SpringApplication.run(SpringbasicsApplication.class, args);
		logger.info("✅ Application Started Successfully!");
	}
}
