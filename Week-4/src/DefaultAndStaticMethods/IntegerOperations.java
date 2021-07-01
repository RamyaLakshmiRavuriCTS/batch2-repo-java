package DefaultAndStaticMethods;

/*StringOperations interface have teo methods
 * concat and length
 * concat is default method and length is static method
 * from java 8 onwards dafault and static methods are included in interfaces*/
public interface IntegerOperations {

    /*add string hello from default method to input string*/
    default int add(int num1,int num2) {
        System.out.println("Method call from IntegerOperations");
        return num1+num2 ;
    }

    /*calculate the length of string (no of characters)*/
    static int max(int num1, int num2) {
        System.out.println("static method call from IntegerOperations");
        return Integer.max(num1,num2);
    }
}
