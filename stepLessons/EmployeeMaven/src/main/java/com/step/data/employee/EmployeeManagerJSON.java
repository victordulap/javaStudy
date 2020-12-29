package com.step.data.employee;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerJSON {
    // List<Employee> -> JSON
    // JSON -> List<Employee>
    public static void main(String[] args) {
        List<Employee> emps = EmployeeUtil.getDummyEmployeeList();

//        writeJSON(emps);
        List<Employee> employees = readJSON();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName());
        }
    }

    public static void writeJSON(List<Employee> emps) { // [ {}, {}, {} ]
        JSONArray jsonArray = new JSONArray();
        for (Employee emp : emps) {
            JSONObject jsonEmployee = new JSONObject();
            jsonEmployee.put("name", emp.getName());

            jsonArray.add(jsonEmployee);
        }

        try (FileWriter fw = new FileWriter("D:\\test.json")) {
            fw.write(jsonArray.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readJSON() {
        try (FileReader reader = new FileReader("D:\\test.json")) {
            List<Employee> emps = new ArrayList<>();

            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(reader); // ParseException
            for (int i = 0; i < jsonArray.size(); i++) {
                Object obj = jsonArray.get(i);
                JSONObject jsonObject = (JSONObject) obj;

                String name = jsonObject.get("name").toString();
                Employee emp = new Employee(name);

                emps.add(emp);
            }

            return emps;
        } catch (IOException | ParseException e) {
            return null;
        }
    }
}
