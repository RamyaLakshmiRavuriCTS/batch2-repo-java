import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList:");
        int size = scanner.nextInt();
        ArrayList<String> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            students.add(scanner.next());
        }
        System.out.println(UserMainCode.highestScorer(students));
    }
}
