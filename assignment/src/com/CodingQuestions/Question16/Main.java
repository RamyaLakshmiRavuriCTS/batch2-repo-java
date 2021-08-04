import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first date:");
        String string1 = sc.nextLine();
        System.out.println("enter the second date:");
        String string2 = sc.nextLine();
        System.out.println("older date is:");
        System.out.println(UserMainCode.findOldDate(string1, string2));
    }
}