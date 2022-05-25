import java.util.HashMap;

public class LargestSubarrZeroSum {
    int maxLen(int arr[], int n) {

        int res = 0;
        int i = -1;
        // psum here is our prefix sum
        int psum = 0;
        // in map we store psum with respect to their index
        HashMap<Integer, Integer> map = new HashMap<>();
        // inital prefix sum is 0 since we haven't started traversing , so assume -1 idx
        map.put(psum, i);
        while (i < arr.length - 1) {
            i++;
            psum += arr[i];
            // if map already contains the psum as a key, this means we have encountered
            // psum again ,
            // this means that the sum of elements after the first occurence of psum is 0
            // and that is the subarray that we have to find
            if (map.containsKey(psum)) {
                int len = i - map.get(psum);
                res = Math.max(len, res);
            } else
                map.put(psum, i);
        }
        return res;
    }
}
