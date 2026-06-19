package com.ramesh.java8coding;

// Remove the Duplicate elements in the list using java 8

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        // Given List of Integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);

        // Using distinct() method to remove duplicate elements
        List<Integer> distinctList = numbers.stream() // convert list into stream
                                    .distinct() // remove the duplicates
                                    .toList(); // convert stream back to list

        System.out.println("Original List: " + numbers);
        System.out.println("Distinct List: " + distinctList);

        // Given List of Strings
        List<String> fruits = Arrays.asList("apple", "orange", "banana", "kiwi", "grapefruit", "apple");

        List<String> originality = fruits.stream() // convert list into stream
                                  .distinct() // remove the duplicate
                                  .toList(); // convert stream back to list
        System.out.println("Original List: " + originality);
    }
}
