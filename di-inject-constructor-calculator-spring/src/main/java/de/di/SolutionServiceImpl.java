/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Service implementation.
 *
 * @author Lofi Dewanto
 * @version 1.0.0
 * @since 1.0.0
 */
@Service
public class SolutionServiceImpl implements SolutionService {

	private static final Logger logger = LoggerFactory.getLogger(SolutionServiceImpl.class);

	private final UdmService udmService;

	private final Calculator calculator;

	/**
	 * Constructor injection.
	 *
	 * @param udmService
	 */
	public SolutionServiceImpl(UdmService udmService, Calculator calculator) {
		super();
		this.udmService = udmService;
		this.calculator = calculator;
	}

	@Override
	public Set<String> getSolutionUsers() {
		logger.info("Using UDM");
		String user = udmService.findUdmUserById(1L);

		int add = calculator.add(10, 20);

		Set<String> result = new HashSet<String>();
		result.add("User Name " + user + "- Calculator Result: " + add);

		return result;
	}

}
