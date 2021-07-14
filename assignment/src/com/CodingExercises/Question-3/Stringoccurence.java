import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringoccurence {
    /*Main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();

        String string2 = scanner.nextLine();
        getvalues(string1, string2);
    }

    /*Counts the occurence of string*/
    public static void getvalues(String string1, String string2) {
        int count = 0;
        StringTokenizer string = new StringTokenizer(string2, " ");

        String string3 = string.nextToken();
        String string4 = string.nextToken();

        StringTokenizer output = new StringTokenizer(string1, " ");
        while (output.hasMoreTokens()) {
            String string5 = output.nextToken();
            if (string4.equals(string5)) {
                count++;
            }
        }
        System.out.println("count:" + count);
    }
}