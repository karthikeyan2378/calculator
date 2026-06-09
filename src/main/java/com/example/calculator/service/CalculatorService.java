package com.example.calculator.service;

import com.example.calculator.exception.CalculatorException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {

        if(b==0)
        {
            throw new CalculatorException("Division by zero is not allowed");
        }

        return a / b;
    }
}
