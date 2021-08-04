import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of Cards :");
        int size= sc.nextInt();

        for(int i=0;i<size;i++)
        {
            System.out.println("Enter card "+(i+1));
            Card card=new Card(sc.next(), sc.nextInt());
            UserMainCode.insert(card);
        }
        UserMainCode.display();
    }

}