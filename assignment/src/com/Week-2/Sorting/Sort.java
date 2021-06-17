import java.util.*;

public class Sort {
    static List<Number> numbers = new ArrayList<>();
    static Set<Number> noDuplicate = new HashSet<>();

    public static List<Number> removeDuplicates(List<Number> numbers) {
        List<Number> originalList = new ArrayList<>();
        for (Number number : numbers) {
            noDuplicate.add(number);
        }
        for (Number number : noDuplicate) {
            originalList.add(number);
        }
        return originalList;
    }

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
            // System.out.println(result.get(i).getNumber());
        }
        return result;
    }

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

    public static void main(String[] args) {
        double number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N=");
        double n = sc.nextDouble();
        System.out.println("Enter Collection:");
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
        List<Number> result = removeDuplicates(numbers);
        List<Number> sorted = sort(result);
        System.out.println("Sorted elements:");
        for (Number i : sorted) {
            double x = i.getNumber();
            if (Math.ceil(x) == x)
                System.out.print((int) x + "\t");
            else System.out.print(x + "\t");
        }
        int index = binarySearch(n, sorted);
        if (index == -1) {
            System.out.println("\nGiven element doesn't exist");
        } else {
            if (Math.ceil(n) == n)
                System.out.println("\nElement " + (int) n + " exists at index " + index);
            else
                System.out.println("\nElement " + n + " exists at index " + index);
        }
    }
}

