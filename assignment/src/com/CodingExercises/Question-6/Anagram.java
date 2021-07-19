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

        int output = Getanagram.getanagram(string1, string2);
        if (output == 1) {
            System.out.println("Anagrams.");
        } else {
            System.out.println("Not Anagrams.");
        }
    }
}

