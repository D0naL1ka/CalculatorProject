package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(8.0, calculator.add(5, 3));
        assertEquals(-2.0, calculator.add(-5, 3));
        assertEquals(0.0, calculator.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(2.0, calculator.subtract(5, 3));
        assertEquals(-8.0, calculator.subtract(-5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15.0, calculator.multiply(5, 3));
        assertEquals(-15.0, calculator.multiply(-5, 3));
        assertEquals(0.0, calculator.multiply(5, 0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-2.0, calculator.divide(-6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(5, 0));
    }
}
