package com.step;

import com.step.data.ColoredPencil;
import com.step.data.GraphitePencil;
import com.step.data.Pencil;
import com.step.data.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        GraphitePencil graphitePencil = new GraphitePencil();
        graphitePencil.draw();

        ColoredPencil coloredPencil = new ColoredPencil();
        coloredPencil.draw();

        //
        Pencil pencil = new ColoredPencil();

//      nu putem face asta, putem doar ceea ce este declarat abstract in interfata
//      pencil.colorStuff();
//      pencil.str;

        System.out.println(pencil.getClass());

        ArrayList<Integer> integers = new ArrayList<>();
        List<String> strings = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();
        vector.add(1);


        List<Student> students = new LinkedList<>();

        students.add(new Student("vasea", 2));
        students.add(new Student("victor", 1));

        // pt asta trebuie sa implementam Comparable in Student,
        // si sa scriem dupa ce comparam in metoda care trebuie suprascrisa
        Collections.sort(students);

        for (Student stud :
                students) {
            System.out.println(stud.name + " " + stud.age);
        }
    }
}
