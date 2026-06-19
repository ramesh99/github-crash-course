package com.ramesh.java8coding;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Find the Minimum and Maximum number from the List using Stream API
public class MinMaxWithStreams {
    public static void main(String[] args) {

        //given list of numbers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Stream<Integer> stream = list.stream();
//        int max = stream.mapToInt((num) -> num.intValue())
//                .max()
//                .getAsInt();
//        System.out.println(max);



        int min = list.stream().mapToInt(Integer::intValue).min().orElse(Integer.MAX_VALUE);
        System.out.println("Minimum: " + min);

        int max = list.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
        System.out.println("Maximum: " + max);
    }
}
