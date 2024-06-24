package com.ascent.calculator_app.service;
import org.springframework.stereotype.Service;
@Service
public class CalculatorService {
    public double add( double num1, double num2) {
        return num1 + num2;
    }
    public double sub(double num1, double num2) {
        return num1 - num2;
    }
    public double mul(double num1, double num2) {
        return num1 * num2;
    }
    public double div(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}