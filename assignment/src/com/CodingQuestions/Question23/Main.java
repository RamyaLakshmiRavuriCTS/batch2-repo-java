import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter the date:");
        Scanner scanner = new Scanner(System.in);
        System.out.println(UserMainCode.convertDateFormat(scanner.next()));
    }
}
