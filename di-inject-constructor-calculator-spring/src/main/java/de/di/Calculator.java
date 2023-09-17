package de.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int x, int y) {
        int result = x + y;

        logger.info("Summe: " + result);

        return result;
    }

}
