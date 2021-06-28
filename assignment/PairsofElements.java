import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;
public class Pairs{
    public static void main(String[] args){
        List<Integer> l = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();           //Enter how many values you want to insert
                                       //Enter your input values
        for(int i =0; i<r;i++){
            int num=sc.nextInt();
            l.add(num);               //Adding input to integer list
        }
        int input = sc.nextInt();     //Enter the input number
        System.out.println(l);
        System.out.println("Pairs of elements whose sum is " + input + " are : "  );
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                if(l.get(i)+l.get(j) == input)    //Checking Pairing of numbers with the input number
                    System.out.println(l.get(i) + "+" + l.get(j) + "=" + input );

            }
        }
    }
}