package Assignment27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Author> authors = new ArrayList<>();

        System.out.println("Enter the book name");
        String bookName = scanner.nextLine();

        System.out.println("Enter the number of authors");
        int noOfAuthors = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < noOfAuthors; i++) {

            System.out.println("Enter the author name");
            String authorName = scanner.nextLine();

            System.out.println("Enter the author email id");
            String authorEmail = scanner.nextLine();

            System.out.println("Enter the author's gender");
            String authorGender = scanner.nextLine();

            authors.add(new Author(authorName, authorEmail, authorGender));
        }

        System.out.println("Enter the book price");
        double bookPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Is the book currently available? Type “Yes/No” (Not case sensitive)");
        String bookAvailability = scanner.nextLine();

        int bookQtyInStock = 0;
        if (bookAvailability.equalsIgnoreCase("yes")) {
            System.out.println("Enter the number of books available");
            bookQtyInStock = Integer.parseInt(scanner.nextLine());
        }

        Book book = new Book(bookName, authors, bookPrice, bookQtyInStock);
        System.out.println(book);

    }
}
