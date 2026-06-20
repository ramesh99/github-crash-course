package com.ramesh.java8coding;

// Find the first 3 even numbers square by using java 8 API

import java.util.Arrays;
import java.util.List;

public class FindSquare {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                .filter(i -> i % 2 == 0) // filter the even numbers
                .map(i -> i * i) // square the even numbers
                .limit(3) // limit the first 3 even numbers
                .toList(); // convert back to the list
        System.out.println(result);
    }
}
