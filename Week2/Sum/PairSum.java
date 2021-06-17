import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PairSum {
    private static Scanner sc=new Scanner(System.in);
    private static int[] array;
    public static void main(String[] args){
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        PairSum pair=new PairSum();
        System.out.println("Enter elements");
        array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter input Number");
        int num=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i:array){
            list.add(i);
        }
        pair.printPairOfElements(list,num);
    }
    private void printPairOfElements(List<Integer> list,int number){
        System.out.println("The pair of elements are:");
        int n=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(number==list.get(i)+list.get(j)){
                    n++;
                    System.out.println("[ "+list.get(i)+","+list.get(j)+" ]");
                    System.out.println(list.get(i) + "+" + list.get(j) + "=" + number);
                }
            }
        }
        if(n==0) {
            System.out.println("Given input doesn't pair with given elements");
        }
    }
}