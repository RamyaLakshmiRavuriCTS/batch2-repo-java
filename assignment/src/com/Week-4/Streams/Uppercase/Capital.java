import java.util.stream.*;

/*Capital is a class which converts input stream into Uppercase */
public class Capital {
    /*Main method*/
    public static void main(String[] args) {

        // Get the stream
        Stream<String> stream = Stream.of("bhaskar", "manidhar", "ramya", "sarat");

        // Print the stream
        stream.map(String::toUpperCase).map(s -> s.concat(" ")).forEach(System.out::println);
    }
}