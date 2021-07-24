import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String string1 = sc.nextLine();

        System.out.println("Enter second string:");
        String string2 = sc.nextLine();

        System.out.println(PlusReplace.replace(string1, string2));
    }
}
