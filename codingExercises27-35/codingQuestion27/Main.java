import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Enter the book name");
        book.setName(sc.next());

       System.out.println("Enter the number of authors");
        int noOfAuthors = sc.nextInt();

        List<Author> authorList=new ArrayList<>();

        for (int i = 0; i < noOfAuthors; i++)
        {
            System.out.println("Enter the author name");
            String authorName = sc.next();

           System.out.println("Enter the author email");
            String authorEmail = sc.next();

            System.out.println("Enter the author gender");
            String authorGender = sc.next();

            Author author = new Author(authorName, authorEmail, authorGender);
            authorList.add(author);
        }

        book.setAuthorList(authorList);
        System.out.println("Enter the book price");
        book.setPrice(sc.nextDouble());

        System.out.println("Is the book currently available? Type “Yes/No” (Not case sensitive)");
        String isAvailable = sc.next();
        if(isAvailable.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter the number of books Available");
            book.setPrice(sc.nextInt());
            System.out.println(book+": Available");
        }
        else{
            System.out.println(book+": Not Available");
        }
    }

}

