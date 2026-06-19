package com.ramesh.java8coding;

// Find the Frequency of each Character in String

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterFrequency {

    public static void main(String[] args) {

        //given string
        String str = "hello world";

        IntStream stream = str.chars(); // convert string into IntStream of character codes
        Map<Character, Long> CharacherLongMap = stream.mapToObj((c) -> (char) c) // convert character codes to Character objects
                .collect(
                        Collectors.groupingBy(c -> c, Collectors.counting())
                );
        System.out.println(CharacherLongMap); // print character and its frequency
    }
}
