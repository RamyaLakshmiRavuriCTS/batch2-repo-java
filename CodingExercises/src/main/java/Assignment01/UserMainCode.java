package Assignment01;

public class UserMainCode {

    public static String replacePlus(String stringOne, String stringTwo){
        return stringOne.replaceAll("(?i)[^"+ stringTwo + "]", "+");
    }
}
