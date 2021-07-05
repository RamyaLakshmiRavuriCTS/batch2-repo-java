package Streams.first;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerStream {

    public static void main(String[] args) {

//        List<Integer> integers = Arrays.asList(1,6,15,8,67,35,46,5);
//        Stream<Integer> integerStream = integers.stream();

//***********************        Lines  12 and 13 do the same as Line 17        ************************

        Stream<Integer> integerStream = Stream.of(1,6,15,8,67,35,46,5);
        Stream<Integer> greaterThan10 = integerStream.filter(i -> i > 10);
        List<Integer> integerList = greaterThan10.collect(Collectors.toList());
        System.out.println(integerList);
    }
}
