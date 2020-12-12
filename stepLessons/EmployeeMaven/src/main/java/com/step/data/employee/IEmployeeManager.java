package com.step.data.employee;

//nu afisam nimic prin aceste functii, doar lucram cu datele
public interface IEmployeeManager {
    void insert(Employee e);

    int findByIdnp(String idnp);

    int findByNameAndSurname(String name, String surname);

    boolean update(int employeeIndex, Employee newEmployee);

    boolean delete(int employeeIndex); // done

//    public List<Employee> read();

//    public void close();
}
