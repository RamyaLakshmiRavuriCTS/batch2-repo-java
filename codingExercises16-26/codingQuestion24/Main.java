import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter date in dd-mm-yyyy");
        System.out.println(UserMainCode.getLastDayOfMonth(sc.next()));
    }

}