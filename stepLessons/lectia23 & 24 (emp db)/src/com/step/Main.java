package com.step;

import com.step.employee.Employee;
import com.step.employee.manager.EmployeeManagerInFile;
import com.step.employee.manager.EmployeeManagerInMemory;
import com.step.employee.manager.IEmployeeManager;
import com.step.employee.manager.db.EmployeeDao;
import com.step.employee.manager.db.EmployeeManagerInDataBase;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException/* throws SQLException */ {
////        // 1. obtii conexiunea
////        Connection connection = getConnection();
////        // 2. executi sql
////        Statement statement = connection.createStatement();
////
////        String insertSql = "INSERT INTO test_emp.employee(name, surname) VALUES('John', 'Smith')";
////        String deleteSql = "DELETE FROM test_emp.employee WHERE id = 2";
//////        String updateSql = "UPDATE test_emp.employee SET... WHERE id = 2";
////        String selectSql = "SELECT id, name, surname FROM test_emp.employee";
////
////        // executeUpdate, cand avem UPDATE INSERT sau DELETE, sau
//          // la SELECT COUNT()
////        // executeQuerry, cand avem SELECT
////        int insertedRows = statement.executeUpdate(insertSql);
////        int deletedRows = statement.executeUpdate(deleteSql);
////
////        System.out.println("Rows inserted: " + insertedRows);
////        System.out.println("Rows deleted: " + deletedRows);
////
////        // ca un tabel din BD care am selectat
////        ResultSet resultSet = statement.executeQuery(selectSql);
////        //    id   name    surname
////        // -> 1    john    smith
////        //    2    ion     smith
////
////        // next(), true daca exista rand care poate fi citit, si muta pe next rand
////        while (resultSet.next()) /* la primu next() el pune sageata la prima inregistrare */ {
////            int id = resultSet.getInt("id");
////            String name = resultSet.getString("name");
////            String surname = resultSet.getString("surname");
////            System.out.println(id + ". " + name + " " + surname);
////        }
////
////        // 3. inchizi conexiunea
////        statement.close();
////        connection.close();
//
//        insertSql(new Employee("Jora", "Moldovan"));
//        EmployeeDao dao = new EmployeeDao();
//        try {
//            dao.insert(new Employee("Ion", "Vantu"));
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }




//        // read option
//        int option = 1;
//
//        IEmployeeManager employeeManager;
//        switch (option) {
//            case 1: {
//                employeeManager = new EmployeeManagerInMemory();
//                break;
//            }
//            case 2: {
//                employeeManager = new EmployeeManagerInFile();
//                break;
//            }
//            case 3: {
//                employeeManager = new EmployeeManagerInDataBase();
//                break;
//            }
//        }

        //menu()
//        employeeManager.insert();
//        employeeManager.update();
//        employeeManager.delete();
//        employeeManager.read();

        EmployeeDao dao = new EmployeeDao();
        dao.insert(new Employee("Test", "Amu"));
    }

//    public static void insertSql(Employee employee) throws SQLException {
//        Connection connection = getConnection();
//        Statement statement = connection.createStatement();
//
//        String sql = String.format("INSERT INTO test_emp.employee(name, surname) VALUES('%s', '%s')", employee.getName(), employee.getSurname());
//        int rows = statement.executeUpdate(sql);
//
//        statement.close();
//        connection.close();
//    }
//
//    public static Connection getConnection() {
//        // local host
////        String url = "jdbc:postgresql://127.0.0.1:5432/dbName";
//        String url = "jdbc:postgresql://127.0.0.1:5432/test";
//        String username = "postgres";
//        String password = "admin";
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return connection;
//    }
}
