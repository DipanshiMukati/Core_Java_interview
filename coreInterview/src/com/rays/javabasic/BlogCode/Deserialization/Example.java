package com.rays.javabasic.BlogCode.Deserialization;

import java.io.*;

public class Example implements Serializable {
    public void display() {
        System.out.println("Object created using deserialization");
    }

    public static void main(String[] args) {
        try {
            // Original object banaya
            Example original = new Example();

            // File create ki
            FileOutputStream fos = new FileOutputStream("example.ser");

            // Object ko file mein likhne ke liye stream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Object ko likh diya file mein
            oos.writeObject(original);

            // Stream close ki
            oos.close();

            // File ko read karne ke liye stream banaya
            FileInputStream fis = new FileInputStream("example.ser");

            // File se object read karne ke liye stream :- ( serialized object ko read karne ke liye )
            ObjectInputStream ois = new ObjectInputStream(fis);

            // File se object read kiya aur cast kiya
            Example deserialized = (Example) ois.readObject();

            // Stream close ki
            ois.close();

            // Deserialized object ka method call kiya
            deserialized.display();

        } catch (IOException | ClassNotFoundException e) {
            // Agar exception aayi to print kiya
            e.printStackTrace();
        }
    }
}
