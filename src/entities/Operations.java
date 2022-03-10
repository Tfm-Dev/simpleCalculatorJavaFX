package entities;

import exception.CalculatorException;
import service.Calculator;

public class Operations {
    private Double screen;
    private String action;

    public Operations() { }

    public Operations(Double screen, String action) {
        this.screen = screen;
        this.action = action;
    }

    public Double getScreen() {
        return screen;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void operation(Double value, String action) throws CalculatorException {
        if (this.action == null) {
            screen = value;
        } else {
            calculator(value);
        }
        this.action = action;
    }

    public void calculator(Double value) throws CalculatorException {
        switch (action) {
            case "+":
                screen = Calculator.sum(screen, value);
                break;
            case "-":
                screen = Calculator.subtraction(screen, value);
                break;
            case "*":
                screen = Calculator.multiplication(screen, value);
                break;
            case "/":
                screen = Calculator.division(screen, value);
                break;
        }
    }
}
