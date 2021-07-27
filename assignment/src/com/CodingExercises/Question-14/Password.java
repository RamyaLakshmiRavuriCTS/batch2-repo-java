import java.util.Scanner;

public class Password {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password:");
        String string = scanner.nextLine();

        boolean flag = Password(string);
        if (flag == true)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    //Returns password Valid or Not
    public static boolean Password(String string) {
        int number = 0, character = 0, special = 0;
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.length() >= 8) {
                if (Character.isDigit(string.charAt(i))) {
                    number++;
                }
                if (Character.isLetter(string.charAt(i))) {
                    character++;
                } else {
                    if (string.charAt(i) != ' ' && !Character.isDigit(string.charAt(i)) && !Character.isLetter(string.charAt(i)))
                        special++;
                }
            }
        }
        if (number >= 1 && character >= 1 && special >= 1)
            flag = true;
        return flag;
    }
}