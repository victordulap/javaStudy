package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.model.EmployeeModel;

import java.time.LocalDate;

public class Add {

    @FXML
    private TextField idTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField birthDateTextField;

    @FXML
    private Button btnAdd;

    @FXML
    void onBtnAddAction(ActionEvent event) {

    }

    public EmployeeModel getResult() {
        return new EmployeeModel(Integer.parseInt(idTextField.getText()), nameTextField.getText(), LocalDate.parse(birthDateTextField.getText()));
    }
}

