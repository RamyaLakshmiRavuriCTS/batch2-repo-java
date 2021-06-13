import java.lang.String;
import java.util.Scanner;
public class ReverseOfArray {
    public void reverseWordInMyString(String str) {
        int count = 0;

        String[] words = str.split(" ");
        String reversedString = "";
        int maxIndex = words.length - 1;
        int halfLength = words.length / 2;
        for (int i = 0; i < halfLength; i++) {
            String temp = words[i];
            words[i] = words[maxIndex - i];
            words[maxIndex - i] = temp;
        }
        for (int k = 0; k < words.length; k++) {
            String word = words[k];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
                if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u' || word.charAt(j) == 'A' || word.charAt(j) == 'E' || word.charAt(j) == 'I' || word.charAt(j) == 'O' || word.charAt(j) == 'U') {
                    count++;
                }
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println("Reversed Array :  " + reversedString);
        System.out.println("Number of Vowels :  " + count);

    }

    public static void main(String[] args) {
        ReverseOfArray obj = new ReverseOfArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String str = sc.nextLine();
        obj.reverseWordInMyString(str);
    }
}
