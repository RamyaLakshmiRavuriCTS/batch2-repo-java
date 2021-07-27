package question11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        List<String> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            students.add(scanner.next());
        }
        System.out.println(UserMainCode.highestScorer(students));
    }

}
