import java.util.*;

public class Lastletter {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = scanner.nextLine();
        System.out.println(display(string));
    }

    //Logic implemented class
    public static String display(String input) {
        String string1 = null;
        StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
        StringBuffer stringBuffer = new StringBuffer();
        while (stringTokenizer.hasMoreTokens()) {
            string1 = stringTokenizer.nextToken();
            String str2 = string1.substring(string1.length() - 1);
            String str3 = str2.toUpperCase();
            stringBuffer.append(str3).append("$");
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

}