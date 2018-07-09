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
package de.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import de.di.Storage;
import de.di.UdmService;
import de.di.UdmServiceMock;

/**
 * Spring Java Config.
 * 
 * @author Lofi Dewanto
 * @since 1.0.0
 * @version 1.0.0
 */
@Configuration
@ComponentScan(basePackages = { "de.di" })
public class AppMockConfig {

	@Bean
	public UdmService udmService() {
		return new UdmServiceMock();
	}

	@Bean
	public Storage<String> storageString() {
		Storage<String> storage = new Storage<String>();
		storage.setName("Lofi Storage String Mock");

		return storage;
	}

	@Bean
	public Storage<Integer> storageInteger() {
		Storage<Integer> storage = new Storage<Integer>();
		storage.setName(1);

		return storage;
	}
}
