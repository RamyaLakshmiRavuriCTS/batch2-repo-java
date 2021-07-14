import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Enter first string:
        String string1 = sc.nextLine();

        //Enter second string:
        String string2 = sc.nextLine();

        System.out.println(PlusReplace.replace(string1, string2));
    }


}
