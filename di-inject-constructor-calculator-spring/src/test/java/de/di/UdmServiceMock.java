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

/**
 * Mock for UdmService.
 *
 * @author Lofi Dewanto
 * @version 1.0.0
 * @since 1.0.0
 */
public class UdmServiceMock implements UdmService {

	private static final Logger logger = LoggerFactory.getLogger(UdmServiceMock.class);

	@Override
	public String findUdmUserById(Long id) {
		// No database connection
		logger.info("No database...");
		return "UDM Mock";
	}

}
