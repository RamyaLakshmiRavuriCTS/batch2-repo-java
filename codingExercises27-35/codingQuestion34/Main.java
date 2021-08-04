import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("1. Insert \n2. Search \n3. Delete \n4. Display \n5. Exit \nEnter your choice :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the item to be inserted:");
                    String string = sc.next();
                    UserMainCode.insert(string);
                    break;

                case 2:
                    System.out.println("Enter the item to search :");
                    String string2 = sc.next();
                    UserMainCode.search(string2);
                    break;

                case 3:
                    System.out.println("Enter the item to delete :");
                    String string3 = sc.next();
                    UserMainCode.delete(string3);
                    break;

                case 4:
                    UserMainCode.display();
                    break;

                case 5:
                    System.exit(2);
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;

            }
        }
    }
}