import java.util.List;

public class UserMainCode {
    public static String highestScorer(List<String> students) {
        String[] studentArray = new String[students.size()];
        String highestScorer = null;
        int marks1, marks2, marks3, max = 0, total = 0;
        for (String student : students) {
            studentArray = student.split("-");
            marks1 = Integer.parseInt(studentArray[1]);
            marks2 = Integer.parseInt(studentArray[2]);
            marks3 = Integer.parseInt(studentArray[3]);
            if(marks1<=100&& marks2 <=100&& marks3 <=100) {
                total = marks1 + marks2 + marks3;
            }
            else{
                highestScorer="marks cannot extend 100";
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