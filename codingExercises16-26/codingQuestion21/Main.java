import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter date (MM-dd-yyyy)");

        System.out.println(UserMainCode.getDay(sc.next()));
    }

}