import java.util.Iterator;
import java.util.LinkedHashSet;

public class UserMainCode {
    public static int UniqueEvenNumbers(int[] a) {
        int sum = 0;
        LinkedHashSet<Integer> input = new LinkedHashSet();
        for (int i = 0; i < a.length; i++) {
            input.add(a[i]);
        }

        Iterator<Integer> EvenNumber = input.iterator();
        while (EvenNumber.hasNext()) {
            int Number = EvenNumber.next();
            if (Number % 2 == 0)
                sum = sum + Number;
        }
        if (sum == 0) {
            System.out.println("NO EVEN NUMBERS");

        }
        return sum;
    }
}


