import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter date of birth dd/mm/yyyy");
        System.out.println(UserMainCode.getAge("01/01/2015", sc.next()));
    }

}