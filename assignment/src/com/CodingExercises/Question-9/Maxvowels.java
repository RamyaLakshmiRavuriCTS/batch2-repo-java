import java.util.Scanner;
import java.util.StringTokenizer;

//Main method
public class Maxvowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string1 = scanner.nextLine();
        System.out.println(storeMaxVowelWord(string1));
    }

    //Class returns word which has max no.of vowels
    public static String storeMaxVowelWord(String string1) {
        StringTokenizer string = new StringTokenizer(string1, " ");
        int count = 0, max = 0;
        String string2 = null;
        while (string.hasMoreTokens()) {
            String string3 = string.nextToken();
            count = 0;
            for (int i = 0; i < string3.length(); i++) {
                if (string3.charAt(i) == 'a' || string3.charAt(i) == 'e' || string3.charAt(i) == 'i' || string3.charAt(i) == 'o' || string3.charAt(i) == 'u')
                    count++;
            }
            if (count > max) {
                max = count;
                string2 = string3;
            }
        }
        return string2;
    }
}

