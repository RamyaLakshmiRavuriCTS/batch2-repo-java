import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String string1 = sc.nextLine();
        System.out.println("Enter second string");
        String string2 = sc.nextLine();
        int result = UserMainCode.getAnagram(string1, string2);

        if (result == 1) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }
}
