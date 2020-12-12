package com.step.data.employee;

import com.step.data.menu.Utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDataChecker {
    protected static LocalDate enterBirthDate() {
        LocalDate birthDate;
        do {
            System.out.println("Enter birth date in format dd.MM.yyyy (ex: 31.01.1999)");
            System.out.print("birth date: ");
            String date = EmployeeManager.sc.nextLine();
            date = date.trim();

            try {
                birthDate = LocalDate.parse(date, EmployeeManager.dateTimeFormatter);
                break;
            } catch (Exception e) {
                System.out.println("Invalid date. please try again (ex: 31.01.1999 (dd.MM.yyyy))");
                Utilities.enterAnyValueToContinue();
            }
        } while (true);

        return birthDate;
    }

    protected static double enterSalary() {
        double salary;

        do {
//            System.out.print("Enter salary: ");
            try {
                salary = EmployeeManager.sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Invalid salary format, try again (ex: 9999.9)");
                System.out.print("Enter idnp: ");
            } finally {
                // reset scanner's line so it work properly,
                // it doesn't reset on any scanner nextXxx() methods other than nextLine()
                EmployeeManager.sc.nextLine();
            }
        } while (true);

        return salary;
    }

    protected static String enterIdnp() {
        boolean repetitiveIdnp;
        String enteredIdnp;
        do {
            repetitiveIdnp = false;
            enteredIdnp = EmployeeManager.sc.nextLine();
            enteredIdnp = enteredIdnp.trim();

            boolean verifyRest = true;

            if (enteredIdnp.length() != 13) {
                verifyRest = false;
                System.out.println("IDNP must contain 13 chars!");
                Utilities.enterAnyValueToContinue();
                repetitiveIdnp = true;
                System.out.print("Enter idnp: ");
            }

            if (verifyRest) {
                List<String> idnps = new ArrayList<>();
                for (Employee employee : EmployeeManager.employees) {
                    idnps.add(employee.getIdnp());
                }

                for (String idnp : idnps) {
                    if (idnp.equals(enteredIdnp)) {
                        repetitiveIdnp = true;
                        break;
                    }
                }

                if (repetitiveIdnp) {
                    System.out.println("Entered idnp (" + enteredIdnp + ") is repetitive, try again...");
                    Utilities.enterAnyValueToContinue();
                    enteredIdnp = null;
                    System.out.print("Enter idnp: ");
                }
            }
        } while (repetitiveIdnp);

        return enteredIdnp;
    }

    protected static String enterIdnp(String prevIdnp) {
        boolean repetitiveIdnp;
        String enteredIdnp;
        do {
            repetitiveIdnp = false;
            enteredIdnp = EmployeeManager.sc.nextLine();
            enteredIdnp = enteredIdnp.trim();

            boolean verifyRest = true;

            if (enteredIdnp.length() != 13) {
                verifyRest = false;
                System.out.println("IDNP must contain 13 chars!");
                Utilities.enterAnyValueToContinue();
                repetitiveIdnp = true;
            }

            if (verifyRest) {

                if (enteredIdnp.equals(prevIdnp)) return enteredIdnp;

                List<String> idnps = new ArrayList<>();
                for (Employee employee : EmployeeManager.employees) {
                    idnps.add(employee.getIdnp());
                }

                for (String idnp : idnps) {
                    if (idnp.equals(enteredIdnp)) {
                        repetitiveIdnp = true;
                        break;
                    }
                }

                if (repetitiveIdnp) {
                    System.out.println("Entered idnp (" + enteredIdnp + ") is repetitive, try again...");
                    Utilities.enterAnyValueToContinue();
                }
            }
        } while (repetitiveIdnp);

        return enteredIdnp.trim();
    }

    protected static Job enterJob() {
        boolean validJob = false;
        String job = Job.MANAGER.toString();
        while (!validJob) {
            job = EmployeeManager.sc.nextLine();

            for (Job j : Job.values()) {
                if (j.toString().equals(job.toUpperCase())) {
                    validJob = true;
                }
            }
            if (!validJob) {
                System.out.println("Invalid job, available jobs: " + Arrays.toString(Job.values()));
                Utilities.enterAnyValueToContinue();
                System.out.print("Enter job: ");
            }
        }
        job = job.toUpperCase();

        return Job.valueOf(job);
    }
}
