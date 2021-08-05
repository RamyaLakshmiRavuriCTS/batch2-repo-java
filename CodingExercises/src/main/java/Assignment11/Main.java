package Assignment11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> students = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            students.add(i, scanner.nextLine());
        }

        String maxScorer = UserMainCode.highestScorer(students);
        System.out.println(maxScorer);

    }
}
