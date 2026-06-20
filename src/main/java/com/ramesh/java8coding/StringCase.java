package com.ramesh.java8coding;

// Convert list of string to upper case and lower case by using the java 8 stream API

import java.util.Arrays;
import java.util.List;

public class StringCase {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("ramesh", "kumar", "java", "stream", "api");

        // Convert to upper case
        List<String> upperCase = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Upper Case: " + upperCase);

        // Convert to lower case
        List<String> lowerCase = words.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println("Lower Case: " + lowerCase);
    }
}
