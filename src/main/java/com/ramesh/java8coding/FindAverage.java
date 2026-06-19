package com.ramesh.java8coding;

// Find the Average of given list of numbers using java 8

import java.util.Arrays;
import java.util.List;

public class FindAverage {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        double averag = num.stream() // convert list into stream
                .mapToInt(Integer::intValue) // convert Integer to int
                .average() // find the average
                .getAsDouble();
        System.out.println(averag); // print the average if present
    }
}
