package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    List<Employee> employees = new ArrayList<>();

    public boolean add(Employee e) {
        if(e.getName() != null && e.getSurname() != null) {
            if(!e.getName().trim().isEmpty() && !e.getSurname().trim().isEmpty()) {
                return this.employees.add(e);
            }
        }
        return false;
    }

//    incorrect
//    public void add() {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        String surname = sc.nextLine();
//
//        this.add(new Employee(name, surname));
//    }

    //correct
    public void add() {
        Employee e = this.readEmployeeDataFromKeyBoard();

        this.add(e);
    }

    public Employee readEmployeeDataFromKeyBoard() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String surname = sc.nextLine();

        return new Employee(name, surname);
    }

    public void edit(int i, Employee employee) {
        employees.set(i, employee);
    }

    public Employee get(int pos) {
        return employees.get(pos);
    }
}
