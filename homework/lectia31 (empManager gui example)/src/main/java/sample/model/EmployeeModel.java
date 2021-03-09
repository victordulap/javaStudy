package sample.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class EmployeeModel {
    private IntegerProperty id;
    private StringProperty name;
    private IntegerProperty age;
    private ObjectProperty<LocalDate> birthDate = new SimpleObjectProperty<>();

    public EmployeeModel(Integer id, String name, Integer age) {
        this.id = new SimpleIntegerProperty(id);
        this.name =  new SimpleStringProperty(name);
        this.age =  new SimpleIntegerProperty(age);
    }

    public EmployeeModel(Integer id, String name, LocalDate birthDate) {
        this.id = new SimpleIntegerProperty(id);
        this.name =  new SimpleStringProperty(name);
        this.birthDate =  new SimpleObjectProperty<>(birthDate);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getAge() {
        return age.get();
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public LocalDate getBirthDate() {
        return birthDate.get();
    }

    public ObjectProperty<LocalDate> birthDateProperty() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate.set(birthDate);
    }
}
