package com.tek.list;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        List<String> fruits = new Stack<>(); 

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add(new String("Mango"));
        fruits.add("Banana");

        System.out.println(fruits);
        System.out.println(fruits.get(1) == fruits.get(2));
    }
}
