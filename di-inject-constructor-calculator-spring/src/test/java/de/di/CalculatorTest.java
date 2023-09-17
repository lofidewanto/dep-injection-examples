package de.di;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int add = calculator.add(10, 10);

        assertEquals(20, add);
    }
}