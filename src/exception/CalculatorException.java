package exception;

import java.io.IOException;

public class CalculatorException extends IOException {
    public CalculatorException(String e) {
        super(e);
    }
}
