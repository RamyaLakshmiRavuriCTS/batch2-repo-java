import java.util.stream.Stream;

public class ConvertToUppercase {
    public static void main(String[] args) {

        // Get the stream
        Stream<String> stream = Stream.of("bhargavi", "kalyan", "ramya", "sravani");
        // Print the stream
        stream.map(String::toUpperCase).map(s -> s.concat(" ")).forEach(System.out::println);
    }
}