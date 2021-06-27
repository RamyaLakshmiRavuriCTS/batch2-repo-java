package com.capitals;

import java.util.stream.Stream;

public class converttoUppercase {
    public static void main(String[] args) {

        // Get the stream
        Stream<String> stream = Stream.of("bhaskar", "manidhar", "ramya", "sarat");

        // Print the stream
        stream.map(String::toUpperCase).map(s -> s.concat(" ")).forEach(System.out::println);
    }
}
