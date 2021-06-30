package Streams.second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperString {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Bhaskar", "Manidhar", "Ramya", "sarat");
        Stream<String> wordsStream = words.stream();

        List<String> wordsUpperCase = wordsStream.map(word -> word.toUpperCase()).collect(Collectors.toList());
        System.out.println(wordsUpperCase);
    }
}
