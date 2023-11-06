package com.kagan.school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher ayse = new Teacher(1,"Ayşe",1000);
        Teacher ali = new Teacher(2,"Ali",999);
        Teacher ahmet = new Teacher(3,"Ahmet",1001);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ayse);
        teacherList.add(ali);
        teacherList.add(ahmet);



        Student osman =new Student(1,"Osman",98);
        Student melisa = new Student(2, "Melisa",79);
        Student enes = new Student(3,"Enes",55);

        List<Student> studentList = new ArrayList<>();
        studentList.add(osman);
        studentList.add(melisa);
        studentList.add(enes);


        // School object
        School xyzHighSchool = new School(teacherList,studentList);
        System.out.println("xyzHighSchool has earned " + xyzHighSchool.getTotalMoneyEarned() + " tl ");

        osman.payFees(100);
        melisa.payFees(2345);

        System.out.println("----Making Scholl pay salary  -----");











    }
}
