package Assignment26;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product product = null;

        System.out.println("Enter the product id");
        long id = Long.parseLong(scanner.nextLine());

        System.out.println("Enter the product name");
        String productName = scanner.nextLine();

        System.out.println("Is the product supplied by Nivas Suppliers? Type “yes” or “no” (not case sensitive)");
        String isNivas = scanner.nextLine().toLowerCase();

        if (isNivas.equals("no")) {
            System.out.println("Enter the supplier name");
            String supplierName = scanner.nextLine();
            product = new Product(id, productName, supplierName);
        } else {
            product = new Product(id, productName);
        }

        product.display();
    }
}
