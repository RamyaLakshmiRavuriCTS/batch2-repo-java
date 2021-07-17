public class UserMainCode {
    public static int countNoOfWords(String string1, String string2) {
        int count = 0;
//split method returns an array
        String[] word1 = string1.split(" ");
        String[] word2 = string2.split(" ");
        for(String w : word1){
            if(word2[1].equals(w)){
                count++;
            }
        }
        return count;
    }

    }


//import java.util.StringTokenizer;
//
//public class UserMainCode {
//    public static int countNoOfWords(String string1, String string2) {
//int count = 0;
//        StringTokenizer st = new StringTokenizer(string2, " ");
//        String s3 = st.nextToken();
//        String s4 = st.nextToken();
////System.out.println(s4);
//        StringTokenizer st1 = new StringTokenizer(string1, " ");
//        while (st1.hasMoreTokens()) {
//            String s5 = st1.nextToken();
//            if (s4.equals(s5)) {
//                count++;
//            }
//        }
//        return count;
// }
//}