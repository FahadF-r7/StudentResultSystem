package com.devops.student.main;

public class Student {
    private String name;
    private int maths;
    private int science;
    private int ict;

    public Student(String name, int maths, int science, int ict) {
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.ict = ict;
    }

    public int calculateTotal() {
        return maths + science + ict;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public String determineGrade() {
        double average = calculateAverage();
        if (average >= 75) return "A";
        if (average >= 65) return "B";
        if (average >= 50) return "C";
        if (average >= 35) return "S";
        return "F";
    }
}