package Question27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Book {
    private String name;
    private List<Author> authorList;
    private double price;
    private int qtyInStock;

    public Book() {
    }

    public Book(String name, List<Author> authorList, double price) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
    }

    public Book(String name, List<Author> authorList, double price, int qtyInStock) {
        this.name = name;
        this.authorList = authorList;
        this.price = price;
        this.qtyInStock = qtyInStock;
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
        return
                name + " authored by "+
                        authorList+
                        " costs Rs." + price;
    }
}