package com.ramesh.java8coding;

// Sort the String as Asc and Desc order by using the Java 8 Stream API

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStrings {

    public static void main(String[] args) {


        List<String> fruits = Arrays.asList("banana", "apple", "cherry", "date");

        List<String> asc = fruits.stream()
                .sorted() // it's give natural sorting order
                .toList();
        System.out.println(asc);

        List<String> desc = fruits.stream()
                .sorted(Comparator.reverseOrder()) // it's give reverse sorting order
                .toList();
        System.out.println(desc);


        //String[] strings = {"banana", "apple", "cherry", "date"};

        /*
        // Sort in ascending order
        String[] ascending = Stream.of(strings)
                .sorted()
                .toArray(String[]::new);

        // Sort in descending order
        String[] descending = Stream.of(strings)
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);

        System.out.println("Ascending: " + String.join(", ", ascending));
        System.out.println("Descending: " + String.join(", ", descending));
         */
    }
}
