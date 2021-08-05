package Assignment22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UserMainCode {

    public static ArrayList<String> getName(HashMap<Integer, String> employeeMap) {

        List<String> validEmployeeNames = employeeMap.values().stream()
                .filter(name -> {
                    Pattern pattern = Pattern.compile("^[a-z]+[0-9]+[a-z]*[A-Z]+$");
                    Matcher matcher = pattern.matcher(name);
                    return matcher.matches();
                })
                .collect(Collectors.toList());

        return new ArrayList<>(validEmployeeNames);
    }
}
