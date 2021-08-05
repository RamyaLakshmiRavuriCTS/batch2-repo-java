package Assignment17;

public class UserMainCode {

    public static int findMaxDistance(int[] integers) {
        int len = integers.length;
        int maxDistance = 0;
        int indexOfMaxNum = -1;

        for (int i = 0; i < len - 1; i++) {
            int a = integers[i];
            int b = integers[i + 1];
            int diff = Math.abs(a - b);
            if (diff > maxDistance) {
                maxDistance = diff;
                if (a > b) {
                    indexOfMaxNum = i;
                } else {
                    indexOfMaxNum = i + 1;
                }
            }
        }
        return indexOfMaxNum;
    }
}
