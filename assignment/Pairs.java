import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;
public class Pairs{
    public static void main(String[] args){
        List<Integer> l = new ArrayList();
        // ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values you want to insert :");
        int r= sc.nextInt();
        System.out.println("Enter your input:");
        for(int i =0; i<r;i++){
            int num=sc.nextInt();
            l.add(num);
        }
        System.out.println(l);
        System.out.println("Enter the input number : ");
        int input = sc.nextInt();
        System.out.println("Pairs of elements whose sum is " + input + " are : "  );
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                if(l.get(i)+l.get(j) == input)
                    System.out.println(l.get(i) + "+" + l.get(j) + "=" + input );

            }
        }
    }
}