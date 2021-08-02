import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        book.setName(scanner.next());

        int noOfAuthors = scanner.nextInt();
        List<Author> authorList=new ArrayList<>();
        for (int i = 0; i < noOfAuthors; i++) {

            String authorName = scanner.next();
            String authorEmail = scanner.next();
            String authorGender = scanner.next();

            Author author = new Author(authorName, authorEmail, authorGender);
            authorList.add(author);
        }
        book.setAuthorList(authorList);

        book.setPrice(scanner.nextDouble());
        String isAvailble=scanner.next();
        if(isAvailble.equalsIgnoreCase("yes")){
            book.setPrice(scanner.nextInt());

        }
        else{
            System.out.println(book+": Not Available");
        }
    }

}