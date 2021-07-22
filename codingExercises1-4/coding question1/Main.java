
import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First String");
        String string1 = sc.nextLine();
        System.out.println("Enter the Second String");
        String string2 = sc.nextLine();
        System.out.println(UserMainCode.replacePlus(string1, string2));
    }
}
