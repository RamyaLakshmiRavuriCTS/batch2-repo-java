import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayListAndSetOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of ArrayList");
        int size = input.nextInt();
        System.out.println("Enter the first list Elements");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            int read = input.nextInt();
            list1.add(read);
        }
        System.out.println("Enter the second list Elements");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            int read = input.nextInt();
            list2.add(read);
        }
        System.out.println("Enter the set Operator( Only give +,-,*)");
        char setOperator = input.next().charAt(0);
        System.out.println(performSetOperations(list1, list2, setOperator));
    }

    public static ArrayList<Integer> performSetOperations(ArrayList<Integer> list1, ArrayList<Integer> list2, char setOperator) {
        ArrayList<Integer> result;
        if (setOperator == '+') {
            result = new ArrayList<>(list1);
            for (int i = 0; i < list2.size(); i++) {
                if (!result.contains(list2.get(i)))
                    result.add(list2.get(i));
            }
        } else if (setOperator == '-') {
            result = new ArrayList<>(list1);
            for (int i = 0; i < list2.size(); i++) {
                if (result.contains(list2.get(i)))
                    result.remove(list2.get(i));
            }
        } else if(setOperator == '-'){
            result = new ArrayList<>();
            HashSet<Integer> set = new HashSet<>(list1);
            for (int i = 0; i < list2.size(); i++) {
                if (set.contains(list2.get(i)))
                    result.add(list2.get(i));
            }
        }
	else{
		System.out.println("Please use mentioned operators");
		System.exit(0);
	}
        return result;
    }
}
