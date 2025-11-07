package com.rays.exception;
public class TestFinallyReturn {
    public static int demo() {
        try {
            return 10;
        } finally {
            return 20; // Warning: finally block returns value
        }
    }

    public static void main(String[] args) {
        System.out.println(demo()); // Output: 20
    }
}
