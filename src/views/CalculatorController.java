package views;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import service.Calculator;

public class CalculatorController {

    @FXML
    private TextField screen;
    @FXML
    private Button btZero;
    @FXML
    private Button btOne;
    @FXML
    private Button btTwo;
    @FXML
    private Button btThree;
    @FXML
    private Button btFour;
    @FXML
    private Button btFive;
    @FXML
    private Button btSix;
    @FXML
    private Button btSeven;
    @FXML
    private Button btEight;
    @FXML
    private Button btNine;
    @FXML
    private Button btAC;
    @FXML
    private Button btClear;
    @FXML
    private Button btDot;
    @FXML
    private Button btSum;
    @FXML
    private Button btSubtratiction;

    @FXML
    private Button btResult;

    private double result;
    private String action;

    @FXML
    public void onBtZeroAction() {
        if (screen.getLength() > 0 && screen.getText().charAt(0) != '0') screen.setText(screen.getText() + '0');
        else if (screen.getLength() >= 2 && screen.getText().substring(0, 2).equals("0.")) screen.setText(screen.getText() + '0');
    }

    @FXML
    public void onBtOneAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("1");
        else screen.setText(screen.getText() + "1");
    }

    @FXML
    public void onBtTwoAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("2");
        else screen.setText(screen.getText() + "2");
    }

    @FXML
    public void onBtThreeAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("3");
        else screen.setText(screen.getText() + "3");
    }

    @FXML
    public void onBtFourAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("4");
        else screen.setText(screen.getText() + "4");
    }

    @FXML
    public void onBtFiveAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("5");
        else screen.setText(screen.getText() + "5");
    }

    @FXML
    public void onBtSixAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("6");
        else screen.setText(screen.getText() + "6");
    }

    @FXML
    public void onBtSevenAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("7");
        else screen.setText(screen.getText() + "7");
    }

    @FXML
    public void onBtEightAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("8");
        else screen.setText(screen.getText() + "8");
    }

    @FXML
    public void onBtNineAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("9");
        else screen.setText(screen.getText() + "9");
    }

    @FXML
    public void onBtACAction() {
        screen.setText("0");
    }

    @FXML
    public void onBtClearAction() {
        if(screen.getLength() > 1) screen.setText(screen.getText().substring(0, screen.getLength() - 1));
        else screen.setText("0");
    }

    @FXML
    public void onBtDotAction() {
        if (screen.getText().indexOf('.') == -1 && screen.getLength() > 0) screen.setText(screen.getText() + ".");
    }

    @FXML
    public void onBtSumAction() {
        if (action == null) {
            action = "+";
            result = Double.parseDouble(screen.getText());
            screen.setText("0");
        }
    }

    @FXML
    public void onBtSubtractionAction() {
        if (action == null) {
            action = "-";
            result = Double.parseDouble(screen.getText());
            screen.setText("0");
        }
    }

    @FXML
    public void onBtResultAction() {
        Locale.setDefault(Locale.US);
        switch (action) {
            case "+":
                result = Calculator.sum(result, Double.parseDouble(screen.getText()));
                action = null;
                break;
            case "-":
                result = Calculator.subtraction(result, Double.parseDouble(screen.getText()));
                action = null;
                break;
            default:
                result = 0;
                break;
        }
        screen.setText(String.format("%.2f", result));
    }
}