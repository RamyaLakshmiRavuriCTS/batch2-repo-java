import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserMainCode {

//    //returns the list of names that followed the specified pattern


    public static ArrayList<String> getName(HashMap<Integer, String> personmap) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (Map.Entry<Integer, String> set : personmap.entrySet()) {
            int length = set.getValue().length();

            if (set.getValue().charAt(0) <= 122 && set.getValue().charAt(0) >= 97) {

                if (set.getValue().charAt(length - 1) <= 90 && set.getValue().charAt(0) >= 65) {


                    if (set.getValue().matches(".*\\d+.*"))
                        arrayList.add(set.getValue());
                }
            }
        }
        return arrayList;
    }
}