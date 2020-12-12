package com.step.data.employee;

import com.step.data.menu.Utilities;

import java.io.*;
import java.time.LocalDate;

public class EmployeeFileDataReader {
    //csv
    protected static void importFromCSVFile() {
        String path = ".\\data\\employees.txt"; // works
        File file = new File(path);
        if (!file.exists()) {
            try {
                boolean fileCreatedSuccessfully = file.createNewFile();
                System.out.println("There was no file before, so a new file was created.");
                Utilities.enterAnyValueToContinue();
                return;
            } catch (IOException e) {
                System.out.println("Undetected error on file creating process.");
            }
        }

        EmployeeManager.employees.clear();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
                EmployeeManager.employees.add(convertFromCSVToEmployee(line));
            }
        } catch (IOException e) {
            System.out.println("Undetected error on file reading process.");
        }
    }

    protected static void exportToCSVFile() {
        String path = ".\\data\\employees.txt";
        File file = new File(path);
        if (!file.exists()) {
            try {
                boolean fileCreatedSuccessfully = file.createNewFile();
                System.out.println("No data, instead created employees.txt");
                return;
            } catch (IOException e) {
                System.out.println("Undetected error on file creating process.");
            }
        }

        try {
            FileWriter writer = new FileWriter(file);

            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for (Employee employee : EmployeeManager.employees) {
                bufferedWriter.write(convertFromEmployeeToCSV(employee) + "\n");
            }
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static String convertFromEmployeeToCSV(Employee employee) {
        return employee.getName() + "," +
                employee.getSurname() + "," +
                employee.getIdnp() + "," +
                employee.getBirthDate() + "," +
                employee.getSalary() + "," +
                employee.getJob();
    }

    private static Employee convertFromCSVToEmployee(String csvLine) {
        String[] parameters = csvLine.split(",");

        String name = parameters[0];
        String surname = parameters[1];
        String idnp = parameters[2];
        LocalDate birthDate = LocalDate.parse(parameters[3]);
        double salary = Double.parseDouble(parameters[4]);
        Job job = Job.valueOf(parameters[5]);

        return new Employee(name, surname, idnp, birthDate, salary, job);
    }
    //end csv

    //serializing
    protected static void importFromSerializedFile() {
        try {
            String path = ".\\data\\employees.dat"; // works
            File file = new File(path);
            if (!file.exists()) {
                try {
                    boolean fileCreatedSuccessfully = file.createNewFile();
                    return;
                } catch (IOException e) {
                    System.out.println("Undetected error on file creating process.");
                }
            }

            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            EmployeeManager.employees.clear();
            while (true) {
                try {
                    Object o = objectInputStream.readObject();
                    if (o == null) {
                        break;
                    }

                    EmployeeManager.employees.add((Employee) o);
                } catch (Exception e) {
                    // eof
                    break;
                }
            }

            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    protected static void exportToSerializedFile() {
        try {
            String path = ".\\data\\employees.dat"; // works
            File file = new File(path);
            if (!file.exists()) {
                try {
                    boolean fileCreatedSuccessfully = file.createNewFile();
                    System.out.println("There was no file before, so a new file was created.");
                    Utilities.enterAnyValueToContinue();
                    return;
                } catch (IOException e) {
                    System.out.println("Undetected error on file creating process.");
                }
            }

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Employee employee : EmployeeManager.employees) {
                objectOutputStream.writeObject(employee);
            }

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //end serializing
}
