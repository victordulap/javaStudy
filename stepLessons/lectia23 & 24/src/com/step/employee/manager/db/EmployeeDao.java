package com.step.employee.manager.db;

import com.step.employee.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
// data access obj (dao)
// in oare care DAO, nu trebuie sa fie afisare
public class EmployeeDao {

    public Connection initConnection() throws SQLException {
        String url = "jdbc:postgresql://127.0.0.1:5432/test";
        String username = "postgres";
        String password = "admin";

        return DriverManager.getConnection(url, username, password);
    }

//    public int insert(String name, String surname) throws SQLException {
////        Statement statement = initConnection().createStatement();
////
////        String sql = String.format("INSERT INTO " +
////                "test_emp.employee(name, surname)" +
////                "VALUES('%s', '%s')", name, surname);
//
//        String preparedSql = "INSERT INTO " +
//                "test_emp.employee(name, surname)" +
//                "values (?,?)"; // in loc la valori punem ?
//        Connection connection = initConnection();
//        PreparedStatement preparedStatement =
//                connection.prepareStatement(preparedSql);
//        // incepe de la 1
//        preparedStatement.setString(1, name);
//        preparedStatement.setString(2, surname);
////        preparedStatement.setInt(1, name); // daca ne trebuie int
//        int rows = preparedStatement.executeUpdate();
//
//        preparedStatement.close();
//        connection.close();
//    }
//
    // mai bine de cat prosta parametri String
    public int insert(Employee employee) throws SQLException {
        String preparedSql = "INSERT INTO " +
                "test_emp.employee(name, surname)" +
                "values (?,?)"; // in loc la valori punem ?
        Connection connection = initConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement(preparedSql);
        // incepe de la 1
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getSurname());
//        preparedStatement.setInt(1, name); // daca ne trebuie int
        int rows = preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();

        return rows;
    }

    public void insertTryWithResources(Employee employee) throws SQLException {
        String preparedSql = "INSERT INTO " +
                "test_emp.employee(name, surname)" +
                "values (?,?)"; // in loc la valori punem ?

        try (Connection connection = initConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(preparedSql)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getSurname());
            int rows = preparedStatement.executeUpdate();
        } /*catch (Exception e) {
            e.printStackTrace();
        }*/ // si catch tot nu e necesar

//        daca folosim try with resources, nu trebuie sa inchidem
//        preparedStatement.close();
//        connection.close();
    }

    public void update(Employee employee) throws SQLException {
        // TODO: try-with-resources

        String sql = "UPDATE test_emp.employee SET name=?," +
                "surname=? WHERE id=?";
        Connection connection = initConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, employee.getName());
        preparedStatement.setString(2, employee.getSurname());
        preparedStatement.setInt(3, employee.getId());

        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }

    public void delete(Employee employee) throws SQLException {
        // TODO: try-with-resources

        String preparedSql = "DELETE FROM test_emp.employee " +
                "where id=?";
        Connection connection = initConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement(preparedSql);
        preparedStatement.setInt(1, employee.getId());
        int rows = preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }

    public List<Employee> read() throws SQLException {
        // TODO: try-with-resources

        // SELECT * FROM employee WHERE name IN ('Ion', 'Petru'...)
        String sql = "SELECT id, name, surname FROM test_emp.employee";
        Connection connection = initConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        List<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");

            employees.add(new Employee(id, name, surname));
        }

        statement.close();
        connection.close();
        return employees;
    }
}
