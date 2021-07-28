package Maxscorer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        System.out.println("Enter the strings");
        List<String> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            students.add(sc.next());
        }
        System.out.println(UserMainCode.highestScorer(students));
    }

}