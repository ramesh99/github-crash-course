package com.ramesh.java8coding;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream() // convert list into stream
                .filter(n -> n % 2 == 0) // filter to add the condition to find the even numbers
                .forEach(System.out::println); // to print the output
    }
}
