package com.step.data.employee;

import com.step.data.employee.Employee;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerXML {
    public static void main(String[] args) {
        try {
            List<Employee> abc = new ArrayList<>();
            abc.add(new Employee("Ion"));
            abc.add(new Employee("Ion"));
            abc.add(new Employee("Ion"));
            abc.add(new Employee("Ion"));
            abc.add(new Employee("Ion"));
            readXml();
        } catch (IOException | JDOMException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void writeToXml(List<Employee> emps) throws IOException { //10
        Element employees = new Element("employees");               // <employees>
        Document doc = new Document(employees);
        for (Employee emp : emps) {
            Element employee = new Element("employee");             // <employee>
            Element name = new Element("name");                     //      <name>
            name.setText(emp.getName());                                  //        ION
            employee.addContent(name);
            employees.addContent(employee);
        }
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.setFormat(Format.getPrettyFormat());
        xmlOutputter.output(doc, new FileOutputStream("D:\\test.xml"));
    }
    public static void readXml() throws JDOMException, IOException {
        /*Simple API for XML*/
        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(new File("D:\\test.xml"));
        Element employees = document.getRootElement();
        List<Element> employeeList = employees.getChildren("employee");
        for (Element employee : employeeList) {
            Element name = employee.getChild("name");
            String employeeName = name.getText();
            System.out.println(employeeName);
        }
    }
}