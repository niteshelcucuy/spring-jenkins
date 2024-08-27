package com.demo.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class DemoApplicationTests {
	public static Logger logger= (Logger) LoggerFactory.getLogger(DemoApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case excecuting");
	}

}
