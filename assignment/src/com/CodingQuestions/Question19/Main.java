import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string input:");
        String string = scanner.nextLine();
        System.out.println("last letter of each word is:");
        System.out.println(UserMainCode.getLastLetter(string));
    }
}
