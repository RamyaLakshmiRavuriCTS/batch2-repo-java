import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input string:");
        String string = scanner.nextLine();
        System.out.println("maximum vowels word is:");
        System.out.println(UserMainCode.storeMaxVowelWord(string));
    }
}
