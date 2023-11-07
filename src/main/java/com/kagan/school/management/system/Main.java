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


        Student osman = new Student(1,"Osman",98);
        Student melisa = new Student(2,"Melisa",79);
        Student enes = new Student(3,"Enes",55);
        List<Student> studentList = new ArrayList<>();

        studentList.add(osman);
        studentList.add(enes);
        studentList.add(melisa);


        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        osman.payFees(5000);
        melisa.payFees(6000);
        System.out.println("xyzHighSchool has earned "+ ghs.getTotalMoneyEarned()+ "TL.");

        System.out.println("---Making SCHOOL PAY SALARY---");
        ayse.receiveSalary(ayse.getSalary());
        System.out.println("XYZ High School has spent for salary to " + ayse.getName()
                +" and now has " + ghs.getTotalMoneyEarned()  + "Tl.");

        ahmet.receiveSalary(ahmet.getSalary());
        System.out.println("XYZ High School has spent for salary to " + ahmet.getName()
                +" and now has " + ghs.getTotalMoneyEarned() + "TL.");


        System.out.println(melisa);

        ali.receiveSalary(ali.getSalary());

        System.out.println(ali);


    }


}
