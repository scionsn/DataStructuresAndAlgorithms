
// ref-gfg, return only true or false if the pair exists
import java.util.HashSet;

public class twoSum {
    static boolean pairExists(int arr[], int target) {
        if (arr.length == 1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int pairval = target - arr[i];
            if (set.contains(pairval)) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -1 };
        int target = 8;
        System.out.println(pairExists(arr, target));
        ;

    }
}
