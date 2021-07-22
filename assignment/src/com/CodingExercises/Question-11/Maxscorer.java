import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//main class
public class Maxscorer {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<String> students = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            students.add(scanner.next());
        }
        System.out.println(MaxScorer(students));
    }

    //returns highest scorer name
    public static String MaxScorer(ArrayList<String> students) {
        String student = null, name = null, Name = null;
        int mark1 = 0, mark2 = 0, mark3 = 0, sum = 0, max = 0;
        for (int i = 0; i < students.size(); i++) {
            student = students.get(i);
            StringTokenizer string = new StringTokenizer(student, "-");
            while (string.hasMoreTokens()) {
                name = string.nextToken();
                mark1 = Integer.parseInt(string.nextToken());
                mark2 = Integer.parseInt(string.nextToken());
                mark3 = Integer.parseInt(string.nextToken());
                sum = mark1 + mark2 + mark3;
                if (max < sum) {
                    max = sum;
                    Name = name;
                }
            }
        }
        return Name;
    }
}