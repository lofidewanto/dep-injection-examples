package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UdmService {

	private static final Logger logger = LoggerFactory.getLogger(UdmService.class);

	// private Storage<String> storageString;

	// private Storage<Integer> storageInteger;

	public String findUdmUserById(Long id) {
		// Getting the storage
		logger.info("Storage String name: ... String");
		logger.info("Storage Integer name: ... Integer ");

		// Connect to database
		databaseConnect();

		if (id == 1L) {
			return "UDM";
		} else {
			return "unknown";
		}
	}

	private void databaseConnect() {
		logger.info("Connecting to database...");
	}

}
