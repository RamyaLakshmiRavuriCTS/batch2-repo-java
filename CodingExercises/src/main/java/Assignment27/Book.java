package Assignment27;

import java.util.List;
import java.util.stream.Collectors;

public class Book {
    private String name;
    private List<Author> authorList;
    private double price;
    private int qtyInStock = 0;

    public Book() {
    }

    public Book(String name, List<Author> authorList, double price, int qtyInStock) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public Book(String name, List<Author> authorList, double price) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        String status = "Available";
        String authorNames = this.authorList.stream().map(a -> a.getName()).collect(Collectors.joining(" "));
        if (this.qtyInStock == 0) {
            status = "Not Available";
        }
        return this.name + " authored by " + authorNames + " costs Rs." + this.price + ": " + status;
    }
}
