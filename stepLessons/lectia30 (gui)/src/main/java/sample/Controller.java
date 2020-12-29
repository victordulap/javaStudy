package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField firstNumberTxtField;

    @FXML
    private TextField secondNumberTxtField;

    @FXML
    private Label resultLabel;

    @FXML
    void handlePlusBtnClick(ActionEvent event) {
        System.out.println("click");
//        get first nr
        String firstNr = firstNumberTxtField.getText();

//        get second nr
        String secondNr = secondNumberTxtField.getText();

//        calc result
        double result = Double.parseDouble(firstNr) + Double.parseDouble(secondNr);
        resultLabel.setText(String.valueOf(result));
    }

    @FXML
    void handleDivideBtnClick(ActionEvent event) {
        String firstNr = firstNumberTxtField.getText();
        String secondNr = secondNumberTxtField.getText();

        double result = Double.parseDouble(firstNr) / Double.parseDouble(secondNr);
        resultLabel.setText(String.valueOf(result));
    }

    @FXML
    void handleMinusBtnClick(ActionEvent event) {
        String firstNr = firstNumberTxtField.getText();
        String secondNr = secondNumberTxtField.getText();

        double result = Double.parseDouble(firstNr) - Double.parseDouble(secondNr);
        resultLabel.setText(String.valueOf(result));
    }

    @FXML
    void handleMultiplyBtnClick(ActionEvent event) {
        String firstNr = firstNumberTxtField.getText();
        String secondNr = secondNumberTxtField.getText();

        double result = Double.parseDouble(firstNr) * Double.parseDouble(secondNr);
        resultLabel.setText(String.valueOf(result));
    }
}
