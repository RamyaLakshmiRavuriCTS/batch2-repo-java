package question27;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter the book name");
        book.setName(scanner.next());
        System.out.println("Enter the number of authors");
        int noOfAuthors = scanner.nextInt();
        List<Author> authorList=new ArrayList<>();
        for (int i = 0; i < noOfAuthors; i++) {
            System.out.println("Enter the author name");
            String authorName = scanner.next();
            System.out.println("Enter the author email");
            String authorEmail = scanner.next();
            System.out.println("Enter the author gender");
            String authorGender = scanner.next();
            Author author = new Author(authorName, authorEmail, authorGender);
            authorList.add(author);
        }
        book.setAuthorList(authorList);
        System.out.println("Enter the book price");
        book.setPrice(scanner.nextDouble());
        System.out.println("Is the book currently available? Type “Yes/No” (Not case sensitive)");
        String isAvailble=scanner.next();
        if(isAvailble.equalsIgnoreCase("yes")){
            System.out.println("Enter the number of books Available");
            book.setPrice(scanner.nextInt());
            System.out.println(book+": Available");
        }
        else{
            System.out.println(book+": Not Available");
        }
    }

}
