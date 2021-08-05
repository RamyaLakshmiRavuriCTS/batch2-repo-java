import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter the input date:");
        Scanner scanner=new Scanner(System.in);
        System.out.println(UserMainCode.getAge("01-01-2015",scanner.next()));
    }
}