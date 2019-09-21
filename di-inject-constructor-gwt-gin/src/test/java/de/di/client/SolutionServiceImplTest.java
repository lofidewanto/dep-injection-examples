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
package de.di.client;

import java.util.Set;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;

/**
 * Test.
 *
 * @author Lofi Dewanto
 * @version 1.0.0
 * @since 1.0.0
 */
public class SolutionServiceImplTest {

	private static final Logger logger = Logger.getLogger(SolutionServiceImplTest.class.getName());

	private UserCostCalculator calculator = new UserCostCalculator();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetSolutionUsers() {
		// Constructor injection
		UdmService udmService = new UdmServiceImpl();
		SolutionService solutionService = new SolutionServiceImpl(udmService, calculator);

		Set<String> solutionUsers = solutionService.getSolutionUsers();
		logger.info(solutionUsers.toString());
	}

	@Test
	public void testGetSolutionUsersWithMock() {
		// Using UDM Mock
		UdmService udmServiceMock = new UdmServiceMock();
		// Constructor injection
		SolutionService solutionService = new SolutionServiceImpl(udmServiceMock, calculator);

		Set<String> solutionUsers = solutionService.getSolutionUsers();
		logger.info(solutionUsers.toString());
	}
}
