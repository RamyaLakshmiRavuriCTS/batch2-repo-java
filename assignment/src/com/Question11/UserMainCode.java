package Question11;

import java.util.List;

//Logic implemented class
public class UserMainCode {

    //returns highest scorer name
    public static String highestScorer(List<String> students) {
        String[] studentArray = new String[students.size()];
        String highestScorer = null;
        int m1, m2, m3, max = 0, total = 0;
        for (String student : students) {
            studentArray = student.split("-");
            m1 = Integer.parseInt(studentArray[1]);
            m2 = Integer.parseInt(studentArray[2]);
            m3 = Integer.parseInt(studentArray[3]);
            if(m1<=100&& m2<=100&&m3<=100) {
                total = m1 + m2 + m3;
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
