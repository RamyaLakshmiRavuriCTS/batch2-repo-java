import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    /*Main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        string1 = string1.toLowerCase();
        String string2 = scanner.nextLine();
        string2 = string2.toLowerCase();

        //check if length is same
        if (string1.length() == string2.length()) {

            // convert strings to char array
            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean output = Arrays.equals(charArray1, charArray2);

            if (output) {
                System.out.println("Anagrams.");
            } else {
                System.out.println("Not Anagrams.");
            }
        }
    }
}


