package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SorterdSetInterface {

    public static void main(String[] args) {
        // Create a TreeSet object that implements SortedSet
        SortedSet<Integer> s = new TreeSet<>();
        
        s.add(100); 
        s.add(200);  
        s.add(300);  
        s.add(400); 
        s.add(500);  
        s.add(100);
        System.out.println(s);
        
        // Print the first (smallest) element in the set
        System.out.println(s.first()); 
        
        // Print the last (largest) element in the set
        System.out.println(s.last());  
        
        // Print the size of the set
        System.out.println(s.size());  
        
        // Print a view of the set from 200 (inclusive) to the end
        System.out.println(s.tailSet(200)); 
       
        // Print a view of the set from the beginning to 400 (exclusive)
        System.out.println(s.headSet(400)); 
    }
}