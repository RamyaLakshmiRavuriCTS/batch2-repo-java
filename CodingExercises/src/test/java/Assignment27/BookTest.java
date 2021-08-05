package Assignment27;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void bookConstructorTest() {
        List<Author> authors = new ArrayList<>();
        Author author1 = new Author("Horowitz", "hor@gmail.com", "Male");
        Author author2 = new Author("Sahni", "sahni@gmail.com", "Male");
        Author author3 = new Author("Rajasekaran", "raja@gmail.com", "Male");
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        Book book1 = new Book("Fundamentals of Algms", authors, 560D, 0);
        Book book2 = new Book("Fundamentals of Algms", authors, 560D, 5);

        String expexted1 = "Fundamentals of Algms authored by Horowitz Sahni Rajasekaran costs Rs.560.0: Not Available";
        String expected2 = "Fundamentals of Algms authored by Horowitz Sahni Rajasekaran costs Rs.560.0: Available";

        assertEquals(expexted1, book1.toString());
        assertEquals(expected2, book2.toString());

    }
}