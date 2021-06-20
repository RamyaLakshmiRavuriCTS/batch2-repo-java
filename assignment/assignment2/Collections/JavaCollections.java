import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaCollections {
    public static void main(String[] args){

        List<Integer> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int size= sc.nextInt();
        System.out.println("Enter the values of list");

        for(int i =0; i<size;i++){

            list.add(sc.nextInt());
        }

        System.out.println(list);
        System.out.println("Enter the input number");
        int inputNumber = sc.nextInt();
        System.out.println("Pairs of elements whose sum is " + inputNumber + " are : "  );

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(list.get(i)+list.get(j)==inputNumber)
                    System.out.println(list.get(i) + "+" + list.get(j) + "=" + inputNumber );

            }
        }
    }
}
