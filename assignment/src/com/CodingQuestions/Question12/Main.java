import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input string:");
        String string = scanner.nextLine();
        if (string.length() > 100) {
            string = string.substring(0, 100);
        }
        System.out.println("maximum vowels word is:");
        System.out.println(UserMainCode.getWordWithMaximumVowels(string));
    }
}

