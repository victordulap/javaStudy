package com.step.employee;

import employee.Employee;
import employee.EmployeeManager;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


public class EmployeeManagerTest {
    EmployeeManager manager = new EmployeeManager();

    // se executa inainte de fiecare test
    @Before
    public void init() {
        this.manager = new EmployeeManager();
    }

    @Test
    public void addEmployee() {

        //new employee
        Employee e = new Employee("John", "White");

        //pass employee to employee manager
//        em.add(e);
        ///verify
        TestCase.assertTrue("Testing that we can add one employee to the list", manager.add(e));
//        TestCase.assertEquals("Testing that we can add one employee to the list", true, em.add(e));

        Employee e2 = new Employee(null, null);
        TestCase.assertFalse("Cant add emp with null atributes", manager.add(e2));

        Employee e3 = new Employee("", "");
        TestCase.assertFalse("Cant add emp with empty data", manager.add(e3));

        Employee e4 = new Employee("  ", "   ");
        TestCase.assertFalse("Cant add emp with space instead of data", manager.add(e4));
    }

    public void testEditEmployee() {
        manager.add(new Employee(("Dummy", "Test"));
        EmployeeManager em = new EmployeeManager();

        em.edit(0, new Employee("Ion", "Alb"));
        Employee e = em.get(0);

        TestCase.
    }
}
