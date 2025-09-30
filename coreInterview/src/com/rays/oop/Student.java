package com.rays.oop;

public class Student {

    private String name;                 // private instance variable
    static String college = "ABC College"; // static variable

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Dipanshi");

        Student s2 = new Student();
        s2.setName("Bharti");

        System.out.println(s1.getName() + " from " + Student.college);
        System.out.println(s2.getName() + " from " + Student.college);
        System.out.println(s1.college);
    }
}
