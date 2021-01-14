package sample.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.beans.PropertyChangeListenerProxy;

public class TemporaryModel {
    private Double age;
    private DoubleProperty ageProperty = new SimpleDoubleProperty();

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public double getAgePropertyValue() {
        return ageProperty.get();
    }

    public DoubleProperty getAgeProperty() {
        return ageProperty;
    }

    public void setAgeProperty(double ageProperty) {
        this.ageProperty.set(ageProperty);
    }
}

class Controller {
    public static void main(String[] args) {
        TemporaryModel obj = new TemporaryModel();
        obj.setAge(12.0);

//        obj.getAgeProperty().addListener(new ChangeListener<Number>() {
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//
//            }
//        });

        obj.getAgeProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("Value changed: " + oldValue + " -> " + newValue);
//            GUI

//            DB
        });

        obj.setAgeProperty(200.0);
        obj.setAgeProperty(100.0);
    }
}
