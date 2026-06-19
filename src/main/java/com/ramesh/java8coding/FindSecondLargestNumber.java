package com.ramesh.java8coding;


// Find the second larger number in list of Integers using java 8 stream

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 5, 10, 20, 99, 1, 50);

        int secondLargest = numbers.stream()
                .distinct() // remove the duplicates
                .sorted(Comparator.reverseOrder()) // Sort in reverse order
                .skip(1) // Skip the largest element
                .findFirst() // Get the second largest element
                .get();
                //.orElse(Integer.MIN_VALUE); // Return a default value if not found

        System.out.println("Second Largest Number: " + secondLargest);
    }
}
