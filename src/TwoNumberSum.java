import java.util.Arrays;
import java.util.Hashtable;

public class TwoNumberSum {


    public static void main(String[] args) {

        int[] array = new int[]{2, 5, 7, 13, 12, 4};
        int target = 25;

        System.out.println(Arrays.toString(twoNumberSum(array, target)));
    }

    private static int[] twoNumberSum(int[] array, int target) {
        if (array.length < 2) {
            return new int[] {-1,-1};
        }
        Hashtable<Integer, Integer> map = new Hashtable<>();

        for (int index = 0; index < array.length ; index++) {
            int find = target - array[index];
            if (map.containsKey(find)) {
                return new int[] {map.get(find), index};
            } else {
                map.put(array[index], index);
            }
        }
        return new int[] {-1,-1};
    }
}
