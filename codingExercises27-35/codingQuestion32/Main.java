import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first integer");
        Integer integer1= sc.nextInt();

        System.out.println("Enter the second integer");
        Integer integer2= sc.nextInt();

        UserMainCode.checkStaticAndNonStaticMethods(integer1,integer2);
    }

}