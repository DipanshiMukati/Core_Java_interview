package com.rays.javabasic.BlogCode.ForName;

public class Example {
    public void display() {
        System.out.println("Object created using Class.forName() and newInstance()");
    }

    public static void main(String[] args) {
        try {
            //  Class ko runtime pe load karo

            Class<?> clazz = Class.forName("BlogCode.ForName.Example");

            //  Us class ka object banao using reflection
            Example example = (Example) clazz.getDeclaredConstructor().newInstance(); // constructor ke through object banata hai
            //  Method call karo
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
// clazz.getDeclaredConstructor() :) class ka default (no-arg) constructor leta hai.
//.newInstance() → us constructor se object banata hai, bina new keyword use kiye.
//