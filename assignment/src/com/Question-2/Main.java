import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //"Enter the Size of Array"
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        //"Enter the Array of Integers"
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int sum = EvenSum.addUniqueEven(arr);
        if(sum!=-1){
            System.out.println(sum);
        }
        else
            System.out.println("No Even Numbers!!!");
    }

}
