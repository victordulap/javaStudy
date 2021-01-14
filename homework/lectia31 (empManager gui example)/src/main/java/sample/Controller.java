package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.model.EmployeeModel;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button addBtn;

    @FXML
    private Button editBtn;

    @FXML
    private Button deleteBtn;

    @FXML
    private TableView<EmployeeModel> employeesTable;

    @FXML
    private TableColumn<EmployeeModel, Integer> colId;

    @FXML
    private TableColumn<EmployeeModel, String> colName;

    @FXML
    private TableColumn<EmployeeModel, Integer> colAge;

    //    private List<EmployeeModel> employees = new ArrayList<>();
    private ObservableList<EmployeeModel> employees = FXCollections.observableArrayList(
            (EmployeeModel model) -> new Observable[]{model.idProperty(), model.nameProperty(), model.ageProperty()}
    );

    @FXML
    void onAddEmployeeBtnAction(ActionEvent event) {
        employees.add(new EmployeeModel(1, "Name", 20));
    }

    @FXML
    void onDeleteEmployeeBtnAction(ActionEvent event) {
        employees.remove(0);
    }

    @FXML
    void onEditEmployeeBtnAction(ActionEvent event) {
        employees.get(0).setAge(100);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id")); // coincide cu campul din EmployeeModel
        colName.setCellValueFactory(new PropertyValueFactory<>("name")); // coincide cu campul din EmployeeModel
        colAge.setCellValueFactory(new PropertyValueFactory<>("age")); // coincide cu campul din EmployeeModel

        employeesTable.setItems(employees);
    }
}
