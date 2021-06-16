import java.lang.String;
import java.util.Scanner;
public class ReverseOfArray {
    public void reverseWordInMyString(String str) {
        int count = 0;
        if (str.isEmpty()) {
            System.out.println("Not a valid Input");
        } else {
            for (int k = 0; k < str.length(); k++) {
                char l = str.charAt(k);
                if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' || l == 'A' || l == 'E' || l == 'I'
                        || l == 'O' || l == 'U') {
                    count++;
                }
            }
            char[] words = new char[str.length()];
            int n = words.length;
            for (int i = 0; i < words.length; i++) {
                words[n - 1 - i] = str.charAt(i);
            }
            String reversedString = String.copyValueOf(words);
            System.out.println("Reverse of String :  " + reversedString);
            System.out.println("Number of Vowels :  " + count);

        }

    }
    public static void main(String[]args){
        ReverseOfArray obj = new ReverseOfArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String input = sc.nextLine();
        obj.reverseWordInMyString(input);
    }
}
