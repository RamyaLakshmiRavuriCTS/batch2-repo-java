import java.util.Scanner;
import java.lang.String;

public class Vowelscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array:");
        String s = sc.nextLine();
        arrayReversalAndNoOfVowels(s);

    }

    public static void arrayReversalAndNoOfVowels(String s) {
        int count = 0;

        if (s.isEmpty()) System.out.println("Invalid String");
        else {
            String lowerCase = s.toLowerCase();
            for (int i = 0; i < lowerCase.length(); i++) {
                char vowel = lowerCase.charAt(i);
                if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                    count++;
                }
            }
            char[] word = new char[s.length()];
            int n = word.length;
            for (int i = 0; i < word.length; i++) {
                word[n - 1 - i] = s.charAt(i);
            }

            String reverse = String.copyValueOf(w);
            System.out.println("Reversed Array:" + reverse);
            System.out.println("Number of Vowels: " + count);
        }
    }
}
