import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class ReverseArrayAndCountVowels {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        reverseArrayAndNoOfVowels(string);

    }

    private static void reverseArrayAndNoOfVowels(String string) {
        int count = 0;

        if (string.isEmpty()) {
            System.out.println("Invalid Input");
        } else {

            String string2 = string.toLowerCase();
            for (int i = 0; i < string2.length(); i++) {
                char ch = string2.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }


            char chars[] = string.toCharArray();
            char result[]= new char[string.length()];
            for (int i = chars.length - 1; i >= 0; i--) {
                result[result.length-1-i]=chars[i];
            }
           // System.out.println(Arrays.toString(result)); chars seperated by comma

String reverse=String.copyValueOf(result);//converting array to string
            System.out.println("Reversed String : "+reverse);
            System.out.println("\nNumber of Vowels: " + count);
        }
    }


}