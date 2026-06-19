package com.ramesh.java8coding;

// Reverse each word of string using java 8


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWords {

    public static void main(String[] args) {

        String input = "Hello Java World";

//        String[] split = input.split(" ");
//        Stream<String> stream = Stream.of(split);
//        String result = stream.map(s -> new StringBuilder(s).reverse().toString())
//                .collect(Collectors.joining(" "));
//        System.out.println(result);

        String result = Stream.of(input.split(" ")).map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
