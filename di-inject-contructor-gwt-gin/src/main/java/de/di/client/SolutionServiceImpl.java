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

import javax.inject.Inject;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Service implementation.
 *
 * @author Lofi Dewanto
 * @version 1.0.0
 * @since 1.0.0
 */
public class SolutionServiceImpl implements SolutionService {

    private static Logger logger = Logger
            .getLogger(SolutionServiceImpl.class.getName());

    private final UdmService udmService;

    private final UserCostCalculator userCostCalculator;

    /**
     * Constructor injection.
     *
     * @param udmService
     */
    @Inject
    public SolutionServiceImpl(UdmService udmService, UserCostCalculator userCostCalculator) {
        super();
        this.udmService = udmService;
        this.userCostCalculator = userCostCalculator;
    }

    @Override
    public Set<String> getSolutionUsers() {
        logger.info("\nUsing UDM");
        String user = udmService.findUdmUserById(1L);

        Set<String> result = new HashSet<String>();
        result.add("User Name: " + user);

        // Calculate
        int cost = userCostCalculator.calculateUserCost(user);

        logger.info("User " + user + " - Cost: " + cost);

        return result;
    }

}
