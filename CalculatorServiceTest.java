package com.ascent.calculator_app.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void testAdd() {
        double result = calculatorService.add(10.5, 5.5);
        assertEquals(16.0, result, 0.0001); // Assert that the result is equal to 16.0 with a delta of 0.0001
    }

    @Test
    void testSub() {
        double result = calculatorService.sub(10.5, 5.5);
        assertEquals(5.0, result, 0.0001); // Assert that the result is equal to 5.0 with a delta of 0.0001
    }

    @Test
    void testMul() {
        double result = calculatorService.mul(10.5, 5.0);
        assertEquals(52.5, result, 0.0001); // Assert that the result is equal to 52.5 with a delta of 0.0001
    }

    @Test
    void testDiv() {
        double result = calculatorService.div(10.0, 5.0);
        assertEquals(2.0, result, 0.0001); // Assert that the result is equal to 2.0 with a delta of 0.0001
    }

    @Test
    void testDivByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.div(10.0, 0.0));
    }
}

