import java.util.HashMap;

public class BinaryArraySprt {
    static int[] SortBinaryArray(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        int zero_cnt = map.getOrDefault(0, 0);
        // System.out.println(zero_cnt+""+one_cnt);
        for (int i = 0; i < zero_cnt; i++) {
            arr[i] = 0;
        }
        for (int i = zero_cnt; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }
}
