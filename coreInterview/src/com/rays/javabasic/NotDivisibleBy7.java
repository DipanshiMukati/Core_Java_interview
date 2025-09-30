package com.rays.javabasic;

public class NotDivisibleBy7 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 != 0) { // jo 7 se divide nahi hote wahi print honge
                System.out.println(i);
            }
        }
    }
}
