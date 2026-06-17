package com.ramesh.java8coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Java 8 stream-based implementation that preserves insertion order and
 * remains O(n) by using a LinkedHashMap as the downstream map in groupingBy.
 * It returns the first non-repeating character or a single space ' ' when none found.
 */
public class StringNonRepeateCharacters {
    public static void main(String[] args) {
        String str = "aabbcde";
        str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println(' ')
                );
    }
}
