import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistManipulation {
    /*Main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < s; i++)
            list1.add(scanner.nextInt());
        for (int i = 0; i < s; i++)
            list2.add(scanner.nextInt());

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3 = display(list1, list2);

        Iterator<Integer> integer = list3.iterator();
        while (integer.hasNext()) {
            int n = integer.next();
            System.out.println(n);
        }
    }

    /*Manipulates the given array list*/
    public static ArrayList<Integer> display(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < list1.size(); i++) {
            if (i % 2 == 0)
                list3.add(list2.get(i));
            else
                list3.add(list1.get(i));
        }
        return list3;
    }
}