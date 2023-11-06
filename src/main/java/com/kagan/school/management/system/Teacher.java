package com.kagan.school.management.system;

public class Teacher {
    private int id;
    private String name;
    private double salary;
    private  int salaryEarned;


    public Teacher(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;


    }
    public int getId(){
        return id;
    }
    public String getName (){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;

    }

    public void receiveSalary(int salary){
    salaryEarned += salary;
    School.updateTotalMoneySpend(salary);

    }




}
