package com.demo.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {

	public static Logger logger= (Logger) LoggerFactory.getLogger(DemoApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started");
	}

	public static void main(String[] args) {
		logger.info("Application excecuted");
		SpringApplication.run(DemoApplication.class, args);
	}

}
