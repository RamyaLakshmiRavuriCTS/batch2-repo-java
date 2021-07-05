package DefaultAndStaticMethods;

/*StringOperations interface have teo methods
 * concat and length
 * concat is default method and length is static method
 * from java 8 onwards dafault and static methods are included in interfaces*/
public interface StringOperations {

    /*add string hello from default method to input string*/
    default String concat(String input) {
        return input.concat(" Hello from Default method");
    }

    /*calculate the length of string (no of characters)*/
    static int length(String input) {
        return input.length();
    }
}
