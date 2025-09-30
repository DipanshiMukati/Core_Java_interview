package com.rays.javabasic.BlogCode.FactoryMethod;

import java.util.Calendar;
// Factory method :) Ek aisa method jo  object deta hai, bina 
//new keyword use kiye
public class Example {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//static factory method new calendar likhne ki jrurat nhi padti bs getInstance() call krna hota hai
        System.out.println("Object created using factory method: " + calendar.getTime());
}
}