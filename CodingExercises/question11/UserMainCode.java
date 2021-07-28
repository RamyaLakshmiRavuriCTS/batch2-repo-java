package question11;

import java.util.List;

//Logic implemented class
public class UserMainCode {

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
