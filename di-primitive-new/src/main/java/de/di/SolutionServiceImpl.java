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

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service implementation.
 * 
 * @author Lofi Dewanto
 * @since 1.0.0
 * @version 1.0.0
 */
public class SolutionServiceImpl implements SolutionService {
	
	private static Logger logger = LoggerFactory.getLogger(SolutionServiceImpl.class);

	@Override
	public Set<String> getSolutionUsers() {
		// Get UDM primitively with "new"
		logger.info("Using UDM");
		UdmService udmService = new UdmServiceImpl();

		String user = udmService.findUdmUserById(1L);

		Set<String> result = new HashSet<String>();
		result.add("User Name " + user);
		return result;
	}

}
