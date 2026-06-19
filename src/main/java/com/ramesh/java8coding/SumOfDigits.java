package com.ramesh.java8coding;


// Find the Sum of all Digits of Number using Java 8

import java.util.stream.IntStream;

public class SumOfDigits {

    public static void main(String[] args) {

        // given input
        int input = 12345; // 15

//        IntStream stream = String.valueOf(input).chars();
//        int sum = stream.map((ch) -> Character.getNumericValue(ch))
//                .sum();
//        System.out.println(sum);

        int sum = String.valueOf(input).chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);

    }
}
