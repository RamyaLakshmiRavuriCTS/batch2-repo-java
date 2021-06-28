public interface StringOperations {

    default String concat(String input)
    {
        return input.concat(" Hello from Default method");
    }

    static int length(String input)
    {
        return input.length();
    }
}