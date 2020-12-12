package com.step.data.employee;

import com.step.data.menu.Utilities;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeShowInConsoleManager {
    private EmployeeManager em = new EmployeeManager();
    protected static final Scanner sc = new Scanner(System.in);

    public static void view() {
        Utilities.clearScreen();

        if (EmployeeManager.employees.size() > 0) {
            System.out.println("EMPLOYEE LIST: \n");
        } else {
            System.out.println("NO EMPLOYEES FOUND!");
            Utilities.enterAnyValueToContinue();
            return;
        }

        char cornerTopLeft = '\u2554';
        char cornerTopRight = '\u2557';
        char cornerBottomLeft = '\u255A';
        char cornerBottomRight = '\u255D';
        char lineX = '\u2550';
        char lineY = '\u2551';
        char cross = '\u256C';
        char crossTDown = '\u2566';
        char crossTUp = '\u2569';
        char crossTLeft = '\u2563';
        char crossTRight = '\u2560';

        int employeesSize = EmployeeManager.employees.size();
//        int iN = 3, nameN = 15, surnameN = 15, birthDateN = 10, idnpN = 13, salaryN = 10;
        int iN = employeesSize > 1 ? employeesSize : 2;

        int nameN = 4;
        int surnameN = 7;
        int birthDateN = 10;
        int idnpN = 13;
        int salaryN = 10;
        int jobN = 3;
        for (int i = 0; i < employeesSize; i++) {
            if (EmployeeManager.employees.get(i).getName().length() > nameN) {
                nameN = EmployeeManager.employees.get(i).getName().length();
            }
            if (EmployeeManager.employees.get(i).getSurname().length() > surnameN) {
                surnameN = EmployeeManager.employees.get(i).getSurname().length();
            }
            if (String.valueOf(EmployeeManager.employees.get(i).getSalary()).length() > salaryN) {
                salaryN = String.valueOf(EmployeeManager.employees.get(i).getSalary()).length();
            }
            if (EmployeeManager.employees.get(i).getJob().toString().length() > jobN) {
                jobN = EmployeeManager.employees.get(i).getJob().toString().length();
            }
        }

        System.out.println(cornerTopLeft + Utilities.generateMultipleChars(iN, lineX) + crossTDown // i
                + Utilities.generateMultipleChars(nameN, lineX) + crossTDown //name
                + Utilities.generateMultipleChars(surnameN, lineX) + crossTDown // surname
                + Utilities.generateMultipleChars(birthDateN, lineX) + crossTDown // birth date
                + Utilities.generateMultipleChars(idnpN, lineX) + crossTDown // idnp
                + Utilities.generateMultipleChars(salaryN, lineX) + crossTDown // salary
                + Utilities.generateMultipleChars(jobN, lineX) // job
                + cornerTopRight);
        System.out.println(lineY + Utilities.insertWordWithNSpaces(iN, "nr") + lineY
                + Utilities.insertWordWithNSpaces(nameN, "name") + lineY
                + Utilities.insertWordWithNSpaces(surnameN, "surname") + lineY
                + Utilities.insertWordWithNSpaces(birthDateN, "birth date") + lineY
                + Utilities.insertWordWithNSpaces(idnpN, "idnp") + lineY
                + Utilities.insertWordWithNSpaces(salaryN, "salary ($)") + lineY
                + Utilities.insertWordWithNSpaces(jobN, "job") + lineY);

        for (int i = 0; i < employeesSize; i++) {
            System.out.println(crossTRight + Utilities.generateMultipleChars(iN, lineX) + cross // i
                    + Utilities.generateMultipleChars(nameN, lineX) + cross //name
                    + Utilities.generateMultipleChars(surnameN, lineX) + cross // surname
                    + Utilities.generateMultipleChars(birthDateN, lineX) + cross // birth date
                    + Utilities.generateMultipleChars(idnpN, lineX) + cross // idnp
                    + Utilities.generateMultipleChars(salaryN, lineX) + cross // salary
                    + Utilities.generateMultipleChars(jobN, lineX) // job
                    + crossTLeft);

            System.out.println(lineY + Utilities.insertWordWithNSpaces(iN, String.valueOf(i + 1)) + lineY
                    + Utilities.insertWordWithNSpaces(nameN, EmployeeManager.employees.get(i).getName()) + lineY
                    + Utilities.insertWordWithNSpaces(surnameN, EmployeeManager.employees.get(i).getSurname()) + lineY
                    + Utilities.insertWordWithNSpaces(birthDateN, EmployeeManager.employees.get(i).getBirthDateFormatted()) + lineY
                    + Utilities.insertWordWithNSpaces(idnpN, EmployeeManager.employees.get(i).getIdnp()) + lineY
                    + Utilities.insertWordWithNSpaces(salaryN, String.valueOf(EmployeeManager.employees.get(i).getSalary())) + lineY
                    + Utilities.insertWordWithNSpaces(jobN, (Utilities.firstLetterUpperCase(EmployeeManager.employees.get(i).getJob().toString()))) + lineY);
        }

        System.out.println(cornerBottomLeft + Utilities.generateMultipleChars(iN, lineX) + crossTUp // i
                + Utilities.generateMultipleChars(nameN, lineX) + crossTUp //name
                + Utilities.generateMultipleChars(surnameN, lineX) + crossTUp // surname
                + Utilities.generateMultipleChars(birthDateN, lineX) + crossTUp // birth date
                + Utilities.generateMultipleChars(idnpN, lineX) + crossTUp // idnp
                + Utilities.generateMultipleChars(salaryN, lineX) + crossTUp // salary
                + Utilities.generateMultipleChars(jobN, lineX) // job
                + cornerBottomRight);

        Utilities.enterAnyValueToContinue();
    }

    public void insert() {
        String moreEmployees;

        do {
            Utilities.clearScreen();

            System.out.println("INSERTING NEW EMPLOYEE...");

            System.out.print("Enter name: ");
            String name = EmployeeManager.sc.nextLine();
            name = name.trim();
            name = (name.length() > 0) ? Utilities.firstLetterUpperCase(name) : "";

            System.out.print("Enter surname: ");
            String surname = EmployeeManager.sc.nextLine();
            surname = surname.trim();
            surname = (surname.length() > 0) ? Utilities.firstLetterUpperCase(surname) : "";

            System.out.print("Enter idnp: ");
            String idnp = EmployeeDataChecker.enterIdnp();

            LocalDate birthDate = EmployeeDataChecker.enterBirthDate();

            System.out.print("Enter salary: ");
            double salary = EmployeeDataChecker.enterSalary();

            System.out.print("Enter job: ");
            Job job = EmployeeDataChecker.enterJob();

            em.insert(new Employee(name, surname, idnp, birthDate, salary, job));

            Utilities.clearScreen();

            System.out.println("INSERTED NEW EMPLOYEE:");
            int i = EmployeeManager.employees.size() - 1;
            System.out.println("\tname: " + EmployeeManager.employees.get(i).getName());
            System.out.println("\tsurname: " + EmployeeManager.employees.get(i).getSurname());
            System.out.println("\tbirthdate: " + EmployeeManager.employees.get(i).getBirthDateFormatted());
            System.out.println("\tidnp: " + EmployeeManager.employees.get(i).getIdnp());
            System.out.println("\tsalary: $" + EmployeeManager.employees.get(i).getSalary());
            System.out.println("\tjob: " + Utilities.firstLetterUpperCase(EmployeeManager.employees.get(i).getJob().toString()));

            System.out.println("Enter 1 to add more, or any value to go back...");
            moreEmployees = EmployeeManager.sc.nextLine();
            moreEmployees = moreEmployees.trim();
        } while (moreEmployees.equals("1"));

    }

    public void delete() {
        //submenu
        int nav = -1;
        do {
            Utilities.clearScreen();

            System.out.println("Select delete method:");
            System.out.println();
            System.out.println("\t1. delete by idnp");
            System.out.println("\t2. delete by name and surname");
            System.out.println();
            System.out.println("\t0. back");

            System.out.print("\nenter submenu number: ");
            try {
                nav = EmployeeManager.sc.nextInt();
            } catch (Exception e) {
                System.out.println("\nInvalid format, try again (ex: 1)");
                Utilities.enterAnyValueToContinue();
            } finally {
                EmployeeManager.sc.nextLine();
            }

            switch (nav) {
                case 1:
                    this.deleteByIdnp();
                    break;
                case 2:
                    this.deleteByNameAndSurname();
                    break;
                case 0:
                    return;

                default:
                    System.out.println("\nNo such submenu, try again (ex: 1)");
                    Utilities.enterAnyValueToContinue();
                    break;
            }
        } while (nav != 0);
        //submenu
    }

    public Employee updateStatement(int employeeIndex) {
        System.out.println("Editing employee " + EmployeeManager.employees.get(employeeIndex).getName()
                + " " + EmployeeManager.employees.get(employeeIndex).getSurname() /*+ " (id: "
                + employees.get(employeeIndex).getId() + " / idnp: "*/
                + " (idnp: " + EmployeeManager.employees.get(employeeIndex).getIdnp() + ")...");
        System.out.print("name: " + EmployeeManager.employees.get(employeeIndex).getName() + " -> ");
        String name = sc.nextLine();
        name = name.trim();
        name = Utilities.firstLetterUpperCase(name);

        System.out.print("surname: " + EmployeeManager.employees.get(employeeIndex).getSurname() + " -> ");
        String surname = sc.nextLine();
        surname = surname.trim();
        surname = Utilities.firstLetterUpperCase(surname);

        System.out.print("birth date: " + EmployeeManager.employees.get(employeeIndex).getBirthDateFormatted() + " -> ");
        LocalDate birthDate = EmployeeDataChecker.enterBirthDate();

        System.out.print("idnp: " + EmployeeManager.employees.get(employeeIndex).getIdnp() + " -> ");
        String idnp = EmployeeDataChecker.enterIdnp(EmployeeManager.employees.get(employeeIndex).getIdnp());

        System.out.print("salary: " + EmployeeManager.employees.get(employeeIndex).getSalary() + " -> ");
        double salary = EmployeeDataChecker.enterSalary();

        System.out.print("job: " + Utilities.firstLetterUpperCase(EmployeeManager.employees.get(employeeIndex).getJob().toString()) + " -> ");
        Job job = EmployeeDataChecker.enterJob();

        return new Employee(name, surname, idnp, birthDate, salary, job);
    }

    public void update() {
        //submenu
        int nav = -1;
        do {
            Utilities.clearScreen();

            System.out.println("Select update method:");
            System.out.println();
            System.out.println("\t1. update by idnp");
            System.out.println("\t2. update by name and surname");
            System.out.println();
            System.out.println("\t0. back");

            System.out.print("\nenter submenu number: ");
            try {
                nav = EmployeeManager.sc.nextInt();
            } catch (Exception e) {
                System.out.println("\nInvalid format, try again (ex: 1)");
                Utilities.enterAnyValueToContinue();
            } finally {
                EmployeeManager.sc.nextLine();
            }

            switch (nav) {
                case 1:
                    this.updateByIdnp();
                    break;
                case 2:
                    this.updateByNameAndSurname();
                    break;
                case 0:
                    return;

                default:
                    System.out.println("\nNo such submenu, try again (ex: 1)");
                    Utilities.enterAnyValueToContinue();
                    break;
            }
        } while (nav != 0);
        //submenu
    }

    private void updateByIdnp() {
        Utilities.clearScreen();

        System.out.print("Enter employee's idnp: ");
        String idnp = sc.nextLine();
        idnp = idnp.trim();

        int employeeIndex = em.findByIdnp(idnp);
        if(employeeIndex >= 0) {
            Employee newEmployee = this.updateStatement(employeeIndex);
            em.update(employeeIndex, newEmployee);
            System.out.println("\nUpdated successfully!\n");
        } else {
            System.out.println("No such employee with indicated idnp (" + idnp + ").");
        }

        Utilities.enterAnyValueToContinue();
    }

    private void updateByNameAndSurname() {
        Utilities.clearScreen();

        System.out.print("Enter employee's name: ");
        String name = sc.nextLine();
        name = name.trim();
        System.out.print("Enter employee's surname: ");
        String surname = sc.nextLine();
        surname = surname.trim();

        int employeeIndex = em.findByNameAndSurname(name,surname);
        if(employeeIndex >= 0) {
            Employee newEmployee = this.updateStatement(employeeIndex);
            em.update(employeeIndex, newEmployee);
            System.out.println("\nUpdated successfully!\n");
        } else if (employeeIndex == -1) {
            System.out.println("No such employee with indicated name and surname (" + name + " " + surname + ")" +
                    ", verify name and surname before entering");
        } else {
            System.out.println("Too many employees with indicated name and surname " +
                    "(" + name + " " + surname + ")" + ", try other method.");
        }

        Utilities.enterAnyValueToContinue();
    }

    private void deleteMessage(Employee employee) {
        System.out.println("Employee " + employee.getName()
                + " " + employee.getSurname() /*+ " (id: "
                + employees.get(employeeIndex).getId() + " / idnp: "*/
                + " (idnp : " + employee.getIdnp() + ") was removed.");
    }

    private void deleteByIdnp() {
        Utilities.clearScreen();

        System.out.print("Enter employee's idnp: ");
        String idnp = sc.nextLine();
        idnp = idnp.trim();

        int employeeIndex = em.findByIdnp(idnp);
        if(employeeIndex >= 0) {
            Employee employeeToDelete = EmployeeManager.employees.get(employeeIndex);

            if (em.delete(employeeIndex)) {
                deleteMessage(employeeToDelete);
            }
        } else {
            System.out.println("No such employee with indicated idnp (" + idnp + ").");
        }

        Utilities.enterAnyValueToContinue();
    }

    private void deleteByNameAndSurname() {
        Utilities.clearScreen();

        System.out.print("Enter employee's name: ");
        String name = sc.nextLine();
        name = name.trim();
        System.out.print("Enter employee's surname: ");
        String surname = sc.nextLine();
        surname = surname.trim();

        int employeeIndex = em.findByNameAndSurname(name, surname);
        if(employeeIndex >= 0) {
            Employee employeeToDelete = EmployeeManager.employees.get(employeeIndex);

            if (em.delete(employeeIndex)) {
                deleteMessage(employeeToDelete);
            }
        } else if(employeeIndex == -2) {
            System.out.println("Too many employees with indicated name and surname " +
                    "(" + name + " " + surname + ")" + ", try other method.");
        } else {
            System.out.println("No such employee with indicated name and surname (" + name + " " + surname + ")" +
                    ", verify name and surname before entering");
        }

        Utilities.enterAnyValueToContinue();
    }
}
