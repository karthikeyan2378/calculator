package com.example.calculator.service;

import com.example.calculator.exception.CalculatorException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();


    @Test
    void shouldAddTwoNumbers(){
        int result = calculatorService.add(3,2);
        assertEquals(5, result);
    }

    @Test
    void shouldSubTwoNumbers(){
        int result = calculatorService.subtract(3,2);
        assertEquals(1, result);
    }

    @Test
    void shouldMultiplyTwoNumbers(){
        int result = calculatorService.multiply(3,2);
        assertEquals(6, result);
    }

    @Test
    void shouldDivideTwoNumbers(){
        int result = calculatorService.divide(3,2);
        assertEquals(1, result);
    }

    @Test
    void shouldThrowExceptionWhenDividingByZero(){
        CalculatorException exception = assertThrows(CalculatorException.class, ()->calculatorService.divide(10, 0));

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
