import java.util.Scanner;
import java.util.StringTokenizer;

public class GetMaxVowels {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = scanner.nextLine();
        System.out.println(getMaximumvowels(string));
    }

    //Returns maximum vowel word in sentence
    public static String getMaximumvowels(String string) {
        StringTokenizer string1 = new StringTokenizer(string, " ");
        int count = 0, max = 0;
        String result = null;
        String flag = null;
        while ((string1.hasMoreTokens())) {
            result = string1.nextToken();
            count = 0;
            for (int k = 0; k < result.length(); k++) {
                if (result.charAt(k) == 'a' || result.charAt(k) == 'e' || result.charAt(k) == 'i' || result.charAt(k) == 'o' || result.charAt(k) == 'u')
                    count++;
                if (count > max) {
                    max = count;
                    flag = result;
                }
            }
        }
        return flag;
    }
}