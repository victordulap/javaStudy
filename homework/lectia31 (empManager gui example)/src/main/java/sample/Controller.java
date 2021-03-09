package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.model.EmployeeModel;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
            (EmployeeModel model) -> new Observable[]{model.idProperty(), model.nameProperty(), model.birthDateProperty()}
    );

    @FXML
    void onAddEmployeeBtnAction(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/add.fxml"));
            Parent parent = fxmlLoader.load(); // IOException
            Stage stage = new Stage();

            Add addControler = fxmlLoader.getController(); // folosim instanta la Controller din FXMLLoader

//          modal window
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Add employee");
            Scene scene = new Scene(parent, 300, 300);
            stage.setScene(scene);
            stage.showAndWait();

            if(checkDuplicates()) {
                employees.add(addControler.getResult());
            }

        } catch (IOException e) {
            Alert alert = new Alert(AlertType.ERROR, "Couldn't find file");
            alert.show();
        }
//        employees.add(new EmployeeModel(1, "Name", LocalDate.now()));
    }

    private boolean checkDuplicates() {
        return true;
    }

    @FXML
    void onDeleteEmployeeBtnAction(ActionEvent event) {
        int selectedIndex = this.employeesTable.getSelectionModel().getSelectedIndex();
        employees.remove(selectedIndex);
    }

    @FXML
    void onEditEmployeeBtnAction(ActionEvent event) {
        int selectedIndex = this.employeesTable.getSelectionModel().getSelectedIndex();
        employees.get(selectedIndex).birthDateProperty().set(LocalDate.now());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id")); // coincide cu campul din EmployeeModel
        colName.setCellValueFactory(new PropertyValueFactory<>("name")); // coincide cu campul din EmployeeModel
        colAge.setCellValueFactory(new PropertyValueFactory<>("birthDate")); // coincide cu campul din EmployeeModel

        employeesTable.setItems(employees);
    }
}
