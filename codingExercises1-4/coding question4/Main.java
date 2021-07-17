import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  arraylist size");
        int size = sc.nextInt();
        System.out.println("Enter the elements of first arraylist and then second arraylist");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<2*size;i++){
            if(i< size){
                list1.add(sc.nextInt());
            }
            else{
                list2.add(sc.nextInt());
            }
        }
        List<Integer> result = UserMainCode.generateOddEvenList(list1,list2);
        System.out.println(result);
    }
}
