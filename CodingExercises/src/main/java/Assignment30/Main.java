package Assignment30;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Box");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.println("Enter Length");
            double length = scanner.nextDouble();

            System.out.println("Enter Width");
            double width = scanner.nextDouble();

            System.out.println("Enter Height");
            double height = scanner.nextDouble();

            Box box = new Box(length, width, height);
            box.addBoxToSet();
        }

        Box.displayUniqueBoxes();
    }
}
