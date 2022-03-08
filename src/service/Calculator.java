package service;

import exception.CalculatorException;

public class Calculator {
    public static double sum(double one, double two) {
        return one + two;
    }
    public static double subtraction(double one, double two) {
        return one - two;
    }
    public static double multiplication(double one, double two) {
        return one * two;
    }
    public static double division(double one, double two) throws CalculatorException {
        if (two == 0) throw new CalculatorException("Error!\nUnable to perform division!");
        return one / two;
    }
}
