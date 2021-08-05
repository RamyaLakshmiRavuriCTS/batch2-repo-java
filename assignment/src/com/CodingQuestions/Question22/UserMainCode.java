import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserMainCode {
    public static ArrayList<String> getName(HashMap<Integer, String> map) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, String> set :
                map.entrySet()) {
            int length = set.getValue().length();
            if (set.getValue().charAt(0) <= 122 && set.getValue().charAt(0) >= 97)
                if (set.getValue().charAt(length - 1) <= 90 && set.getValue().charAt(0) >= 65)
                    if (set.getValue().matches(".*\\d+.*"))
                        arrayList.add(set.getValue());
        }
        return arrayList;
    }
}
