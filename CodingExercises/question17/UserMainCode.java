package question17;

//Logic implemented class
public class UserMainCode {
    //returns index of element in array whose diff b/w adjacent elements max
    public static int findMaxDistance(int[] array, int size) {
        int difference, max = 0, index = 0;
        for (int i = 0; i < size - 1; i++) {
            difference = array[i] - array[i + 1];
            if (Math.abs(difference) > max) {
                max = Math.abs(difference);
                if (array[i] > array[i + 1]) {
                    index = i;
                } else {
                    index = i + 1;
                }
            }
        }
        return index;
    }
}
