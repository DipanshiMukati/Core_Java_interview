package  com.rays.javabasic.BlogCode.Reflector;

import java.lang.reflect.Constructor;

// Reflection :)
//Java ka feature jo runtime pe class, method, constructor, etc. access karne deta hai

public class Example {
    public void display() {
        System.out.println("Object created using Constructor.newInstance()");
    }

    public static void main(String[] args) {
        try {
            Constructor<Example> constructor = Example.class.getDeclaredConstructor();
            Example example = constructor.newInstance();
// Constructor se object create karta hai bina new keyword ke
               example.display();
        } catch (Exception e) {
            e.printStackTrace();
       }
   }
}