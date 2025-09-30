package com.rays.javabasic;

public class CirclePattern {
    public static void main(String[] args) {
        int r = 10; // radius

        for (int i = -r; i <= r; i++) {
            for (int j = -r; j <= r; j++) {
                if (i * i + j * j <= r * r + 1 && i * i + j * j >= r * r - 20) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
