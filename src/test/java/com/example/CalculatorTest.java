package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();

        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();

        assertEquals(6, calculator.subtract(10, 4));
    }
}
