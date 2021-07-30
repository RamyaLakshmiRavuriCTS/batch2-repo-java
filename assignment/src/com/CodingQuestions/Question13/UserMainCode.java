public class UserMainCode {
    public static void swapPairs(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        if (length % 2 == 0) {
            for (int i = 0; i < string.length() - 1; i = i + 2) {
                char a = string.charAt(i);
                char b = string.charAt(i + 1);
                sb.append(b).append(a);
            }
            System.out.println(sb);
        } else {
            for (int i = 0; i < string.length() - 1; i = i + 2) {
                char a = string.charAt(i);
                char b = string.charAt(i + 1);
                sb.append(b).append(a);
                System.out.println(sb);
            }
            sb.append(string.charAt(length - 1));
            System.out.println(sb);
        }
    }
}


