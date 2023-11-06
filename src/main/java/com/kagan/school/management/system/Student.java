package com.kagan.school.management.system;

public class Student {
    private int id ;
    private String name;
    private int grade;  // 1 to 4
    private int feesPaid;


    private int feesTotal;

    // constructor
    public Student(int id, String name, int grade){

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    public void payFees(int fees) {
        feesPaid +=     fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }
    public int getFeesTotal() {
        return feesTotal;

    }



    public int getRemainingFees(){
        return feesTotal - feesPaid;

    }



}
