package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SolutionService {

	private static final Logger logger = LoggerFactory.getLogger(SolutionService.class);

	@Autowired
	private UdmService udmService;

	public Set<String> getSolutionUsers() {
		// Get UDM from Spring inject
		logger.info("Using UDM");
		String user = udmService.findUdmUserById(1L);

		Set<String> result = new HashSet<String>();
		result.add("User Name " + user);
		return result;
	}

}
