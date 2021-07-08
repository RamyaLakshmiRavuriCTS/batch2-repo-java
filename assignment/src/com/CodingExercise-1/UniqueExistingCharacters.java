import java.util.Scanner;

public class UniqueExistingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String string1 = sc.nextLine();

        System.out.println("Enter second string:");
        String string2 = sc.nextLine();

        System.out.println(display(string1, string2));
    }

    public static String display(String string1, String string2) {
        String input2 = string1.toLowerCase();
        String input3 = string2.toLowerCase();

        StringBuffer output = new StringBuffer();

        for (int i = 0; i < string1.length(); i++) {
            char character = input2.charAt(i);
            if (input3.indexOf(character) == -1)
                output.append("+");
            else
                output.append(string1.charAt(i));
        }
        return output.toString();

    }
}