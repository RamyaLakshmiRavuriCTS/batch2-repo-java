import java.util.*;

/*This class sort the collections of elements
 * and eliminate the duplicate elements
 * and search the element using binary search*/
public class SortAndSearch {
    static List<Number> numbers = new ArrayList<>();

    /*this method sort the list of elements and
     * sorted list is given as output */
    public static List<Number> sort(List<Number> result) {
        Number temp;
        for (int i = 0; i < result.size(); i++) {
            for (int j = i + 1; j < result.size(); j++) {
                if (result.get(i).getNumber() > result.get(j).getNumber()) {
                    temp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, temp);
                }
            }
        }
        return result;
    }

    /*this method search the given element is present in the list or not
     * if present return index of the element in the sorted list */
    public static int binarySearch(double n, List<Number> sort) {
        int first = 0;
        int last = sort.size() - 1;
        int mid;
        while (first <= last) {
            mid = (first + last) / 2;
            if (sort.get(mid).getNumber() == n) {
                return mid;
            } else if (sort.get(mid).getNumber() < n) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    /*Main method */
    public static void main(String[] args) {
        double number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to search");
        double element = sc.nextDouble();

        System.out.println("Enter element collection(loop ends when you give alphabet as input)");
        while (true) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                numbers.add(new Number(number));
            } else if (sc.hasNextDouble()) {
                numbers.add(new Number(sc.nextDouble()));
            } else {
                break;
            }
        }
        Set<Number> noDuplicate = new HashSet<>();
        noDuplicate.addAll(numbers);
        List<Number> result = new ArrayList<>();
        result.addAll(noDuplicate);
        List<Number> sorted = sort(result);
        System.out.println("Sorted elements:");
        for (Number i : sorted) {
            double x = i.getNumber();
            if (Math.ceil(x) == x)
                System.out.print((int) x + " ");
            else System.out.print(x + " ");
        }
        int index = binarySearch(element, sorted);
        if (index == -1) {
            System.out.println("\nGiven element doesn't exist");
        } else {
            if (Math.ceil(element) == element)
                System.out.println("\nElement " + (int) element + " exists at index " + index);
            else
                System.out.println("\nElement " + element + " exists at index " + index);
        }
    }
}
