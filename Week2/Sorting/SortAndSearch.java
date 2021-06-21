import java.util.*;



public class SortAndSearch {
    static List<Number> numbers = new ArrayList<>();

    public List<Number> sort(List<Number> result) {
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



    public int binarySearch(double n, List<Number> sort) {
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
        SortAndSearch sortAndSearch = new SortAndSearch();
        System.out.println("Enter your element to search");
        double element = sc.nextDouble();
        System.out.println("Enter element collection");
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
        List<Number> sorted = sortAndSearch.sort(result);
        System.out.println("Sorted elements:");
        for (Number i : sorted) {
            double x = i.getNumber();
            if (Math.ceil(x) == x)
                System.out.print((int) x + "\t");
            else System.out.print(x + "\t");
        }
        int index = sortAndSearch.binarySearch(element, sorted);
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
