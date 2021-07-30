import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Product id");
        long id= sc.nextLong();
        System.out.println("Enter Product Name");
        String name= sc.next();
        System.out.println("Is the product supplied by Nivas Suppliers? Type “yes” or “no” (not case sensitive)");
        String reply= sc.next();

        if(reply.equalsIgnoreCase("yes")){
            Product product=new Product(id,name,"Nivas");
            product.display();
        }

        else{
            System.out.println("Enter the supplier name");
            String supplier= sc.next();
            Product product=new Product(id,name,supplier);
            product.display();
        }
    }

}