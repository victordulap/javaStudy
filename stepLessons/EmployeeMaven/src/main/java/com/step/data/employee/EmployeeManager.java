package com.step.data.employee;

import com.step.data.menu.Utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager implements IEmployeeManager {
    protected static final Scanner sc = new Scanner(System.in);
    protected static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    protected static List<Employee> employees = new ArrayList<>();

    //data
    public static void exportCSV() {
        EmployeeFileDataReader.exportToCSVFile();

        System.out.println("Exported successfully!");
        Utilities.enterAnyValueToContinue();
    }

    public static void importCSV() {
        EmployeeFileDataReader.importFromCSVFile();

        System.out.println("Imported successfully!");
        Utilities.enterAnyValueToContinue();
    }

    public static void exportSerialized() {
        EmployeeFileDataReader.exportToSerializedFile();
    }

    public static void importSerialized() {
        EmployeeFileDataReader.importFromSerializedFile();
    }

    // 3way modified:

    /**
     * @return  index in list: <br>
     *          -1, if, employee not found <br>
     *          0..n, if, employee found
     */
    @Override
    public int findByIdnp(String idnp) {
        int employeeIndex = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getIdnp().equals(idnp)) {
                employeeIndex = i;
                break;
            }
        }

        return employeeIndex;
    }

    /**
     * @return  index in list: <br>
     *          -2, if, Too many employees with indicated name and surname <br>
     *          -1, if, employee not found <br>
     *          0..n, if, employee found
     */
    @Override
    public int findByNameAndSurname(String name, String surname) {
        int countFoundEmployees = 0;
        int employeeIndex = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equalsIgnoreCase(name) && employees.get(i).getSurname().equalsIgnoreCase(surname)) {
                countFoundEmployees++;
                if (countFoundEmployees > 1) {
                    employeeIndex = -2;
                    break;
                }
                employeeIndex = i;
            }
        }

        return employeeIndex;
    }

    /**
     * @param employeeIndex the index of employee to delete <br>
     * @return true - if deleted successfully <br>
     * false - if not deleted
     */
    @Override
    public boolean delete(int employeeIndex) {
        if (employeeIndex >= 0) {
            employees.remove(employeeIndex);
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param employeeIndex the index of employee to delete <br>
     * @param newEmployee the data of employee, to replace the old one
     * @return true - if deleted successfully <br>
     * false - if not deleted
     */
    public boolean update(int employeeIndex, Employee newEmployee) {
        if (employeeIndex >= 0) {
            employees.get(employeeIndex).setName(newEmployee.getName());
            employees.get(employeeIndex).setSurname(newEmployee.getSurname());
            employees.get(employeeIndex).setBirthDate(newEmployee.getBirthDate());
            employees.get(employeeIndex).setIdnp(newEmployee.getIdnp());
            employees.get(employeeIndex).setSalary(newEmployee.getSalary());
            employees.get(employeeIndex).setJob(newEmployee.getJob());
            return true;
        } else {
            return false;
        }
    }

    public void insert(Employee e) {
        employees.add(e);
    }
}