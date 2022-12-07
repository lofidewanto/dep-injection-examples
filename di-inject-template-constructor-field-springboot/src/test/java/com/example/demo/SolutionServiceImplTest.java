package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SolutionServiceImplTest {

	private static final Logger logger = LoggerFactory.getLogger(SolutionServiceImplTest.class);

	@Autowired
	SolutionService solutionService;

	@Test
	void get_solution_users() {
		logger.info("Hello World");

		Set<String> solutionUsers = solutionService.getSolutionUsers();

		assertEquals(1, solutionUsers.size());
	}

}
