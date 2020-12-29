package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    private Operation operation;

    private double oldNr = 0;

    @FXML
    private Label result;

    @FXML
    void changeSymbolBtnClick(ActionEvent event) {

    }

    @FXML
    void clearBtnClick(ActionEvent event) {
        result.setText("");
        operation = Operation.NONE;
        oldNr = 0;
    }


    @FXML
    void equalBtnClick(ActionEvent event) {
        double resultNr = Double.parseDouble(result.getText());
        System.out.println("\noldNr: " + oldNr);
        System.out.println("resultNr: " + resultNr);
        System.out.println("operation: " + operation);
        switch (operation) {
            case NONE:
                break;
            case PLUS:
                resultNr = oldNr + resultNr;
                break;
            case MINUS:
                resultNr = oldNr - resultNr;
                break;
            case DIVIDE:
                resultNr = oldNr / resultNr;
                break;
            case MULTIPLY:
                resultNr = oldNr * resultNr;
                break;
        }

        result.setText(String.valueOf(resultNr));
    }

    private void selectOperation(Operation operation) {
        this.operation = operation;
//        oldNr = Double.parseDouble(result.getText());
        oldNr = result.getText().length() > 0 ? Double.parseDouble(result.getText()) : 0;
        result.setText("");
    }

    //    operations
    @FXML
    void plusBtnClick(ActionEvent event) {
        selectOperation(Operation.PLUS);
    }

    @FXML
    void minusBtnClick(ActionEvent event) {
        selectOperation(Operation.MINUS);
    }

    @FXML
    void multiplyBtnClick(ActionEvent event) {
        selectOperation(Operation.MULTIPLY);
    }

    @FXML
    void divideBtnClick(ActionEvent event) {
        selectOperation(Operation.DIVIDE);
    }

    @FXML
    void number0BtnClick(ActionEvent event) {
        String currentNr = result.getText();
        if (currentNr.length() == 0) {
            result.setText("0.");
        } else {
            result.setText(result.getText() + "0");
        }
    }

    @FXML
    void number1BtnClick(ActionEvent event) {
        result.setText(result.getText() + "1");
    }

    @FXML
    void number2BtnClick(ActionEvent event) {
        result.setText(result.getText() + "2");
    }

    @FXML
    void number3BtnClick(ActionEvent event) {
        result.setText(result.getText() + "3");
    }

    @FXML
    void number4BtnClick(ActionEvent event) {
        result.setText(result.getText() + "4");
    }

    @FXML
    void number5BtnClick(ActionEvent event) {
        result.setText(result.getText() + "5");
    }

    @FXML
    void number6BtnClick(ActionEvent event) {
        result.setText(result.getText() + "6");
    }

    @FXML
    void number7BtnClick(ActionEvent event) {
        result.setText(result.getText() + "7");
    }

    @FXML
    void number8BtnClick(ActionEvent event) {
        result.setText(result.getText() + "8");
    }

    @FXML
    void number9BtnClick(ActionEvent event) {
        result.setText(result.getText() + "9");
    }


    @FXML
    void dotBtnClick(ActionEvent event) {
        String currentNr = result.getText();

        if (currentNr.length() == 0) {
            result.setText("0.");
        } else if (!currentNr.contains(".")) {
            result.setText(result.getText() + ".");
        }
    }

}
