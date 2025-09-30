package com.rays.javabasic.BlogCode.UsingClone;

public class Example implements Cloneable {
    public void display() {
        System.out.println("Object created using clone()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //
    }

    public static void main(String[] args) {
        try {
//            original object banaya
            Example original = new Example();
//            original object ka clone banaya
            Example clone = (Example) original.clone(); // Cloning the original object
            clone.display(); // Using the cloned object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
     }
  }
}