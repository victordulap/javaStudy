package com.step;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // cautam stud dupa idnp

        Map<String, Student> students = new HashMap<>();

        Student student1 = new Student("Victor", "123456789");
        Student student2 = new Student("Andrei", "678912345");
        Student student3 = new Student("Andrei", "678345912");
        students.put(student1.getIdnp(), student1);
        students.put(student2.getIdnp(), student2);
        students.put(student3.getIdnp(), student3);

        Student filteredStudent = students.get("1234567891");
        if (filteredStudent != null)
            System.out.println(filteredStudent.getName()
                    + " (" + filteredStudent.getIdnp() + ")");

        for (String key : students.keySet()) {
            System.out.println("key: " + key);
        }

        Collection<Student> values = students.values();
        for (Student student : values) {
            System.out.println("student: " + student);
        }

        // Entry ii un obiect din Map
        for (Map.Entry<String, Student> pair : students.entrySet()) {
            System.out.print("key: " + pair.getKey());
            System.out.print(" => ");
            System.out.println("value: " + pair.getValue());
        }

        Map<String, List<Student>> studentsByNameMap = new HashMap<>();
        Student stud1 = new Student("Victor", "123456789");
        Student stud2 = new Student("Andrei", "678912345");
        Student stud3 = new Student("Andrei", "678345912");

        studentsByNameMap.put(stud1.getName(), new ArrayList<>());
        studentsByNameMap.get(stud1.getName()).add(stud1);

        studentsByNameMap.put(stud2.getName(), new ArrayList<>());
        studentsByNameMap.get(stud2.getName()).add(stud2);
        studentsByNameMap.get(stud3.getName()).add(stud3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(stud1);
        studentList.add(stud2);
        studentList.add(stud3);

        Map<String, List<Student>> studentsByName = new HashMap<>();
        //gruparea dupa nume
        for (Student stud : studentList) {
            if(!studentsByName.containsKey(stud.getName())) {
                studentsByName.put(stud.getName(), new ArrayList<>());
            }
            studentsByName.get(stud.getName()).add(stud);
        }

        System.out.println();
        for (Map.Entry<String, List<Student>> pair : studentsByName.entrySet()) {
            System.out.print("key: " + pair.getKey());
            System.out.print(" => ");
            System.out.println("value: " + pair.getValue());
        }
    }
}
