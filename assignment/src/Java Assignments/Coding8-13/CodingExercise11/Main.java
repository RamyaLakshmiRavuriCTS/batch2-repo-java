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
        System.out.println(highestScorer(students));
    }
    //returns highest scorer name
    public static String highestScorer(List<String> students) {
        String[] studentArray = new String[students.size()];
        String highestScorer = null;
        int mark1, mark2, mark3, max = 0, total = 0;
        for (String student : students) {
            studentArray = student.split("-");
            mark1 = Integer.parseInt(studentArray[1]);
            mark2 = Integer.parseInt(studentArray[2]);
            mark3 = Integer.parseInt(studentArray[3]);
            if(mark1<=100&& mark2<=100&&mark3<=100) {
                total = mark1 + mark2 + mark3;
            }
            else{
                highestScorer="marks cannot extends 100";
                break;
            }
            if (total > max) {
                max = total;
                highestScorer = studentArray[0];
            }
        }
        return highestScorer;
    }

}