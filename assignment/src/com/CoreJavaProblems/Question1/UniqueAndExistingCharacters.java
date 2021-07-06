import java.util.Scanner;

public class UniqueAndExistingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first String");
        String string1 = input.nextLine();
        System.out.println("Enter the second String");
        String string2 = input.nextLine();
        String result = replacePlus(string1, string2);
        System.out.println(result);
    }

    public static String replacePlus(String arg1, String arg2) {
        StringBuilder builder = new StringBuilder(arg1);
        for (int i = 0; i < arg1.length(); i++) {
            char character = arg1.charAt(i);
            if ((arg2.contains(String.valueOf(character).toLowerCase())) || (arg2.contains(String.valueOf(character).toUpperCase())))
                ;
            else
                builder.replace(i, i + 1, "+");
        }
        return String.valueOf(builder);
    }
}
