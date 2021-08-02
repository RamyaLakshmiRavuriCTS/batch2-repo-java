import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Product id");
        long id=scanner.nextLong();
        System.out.println("Enter Product Name");
        String name=scanner.next();
        System.out.println("Is the product supplied by Nivas Suppliers? Type “yes” or “no” (not case sensitive)");
        String reply=scanner.next();
        if(reply.equalsIgnoreCase("yes")){
            ProductDetails product=new ProductDetails(id,name,"Nivas");
            product.display();
        }
        else{
            System.out.println("Enter the supplier name");
            String supplier=scanner.next();
            ProductDetails product=new ProductDetails(id,name,supplier);
            product.display();
        }
    }
}