package testCases;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input:");
        int s = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        for (int i = 0; i < s; i++)
            al1.add(sc.nextInt());
        for (int i = 0; i < s; i++)
            al2.add(sc.nextInt());
        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3 = UserMainCode.generateOddEvenList(al1,al2);
        Iterator<Integer> it = al3.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
    }
}



