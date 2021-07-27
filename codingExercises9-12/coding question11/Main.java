import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of ArrayList");
        int size = sc.nextInt();
        System.out.println("Enter the score patterns");
        List<String> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            students.add(sc.next());
        }
        System.out.println(UserMainCode.highestScorer(students));
    }

}