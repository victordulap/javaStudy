package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        Button buttonAdd = new Button("add");
        Button buttonEdit = new Button("edit");
        Button buttonDelete = new Button("delete");
        button.setText("hello world");

        button.setOnAction((event) -> {
            System.out.println("hello");
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "HELLo wOrlD!");
            alert.showAndWait();
        });

//      container care contine restu elementelor
//        StackPane rootContainer = new StackPane();
//        HBox rootContainer = new HBox();
        VBox rootContainer = new VBox();
        rootContainer.getChildren().addAll(button, buttonAdd, buttonEdit, buttonDelete);
        rootContainer.setSpacing(5);

        Scene scene = new Scene(rootContainer, 500, 500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
