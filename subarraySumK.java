import java.util.HashMap;

public class subarraySumK {
    public int subarraySum(int[] nums, int k) {
        // psum here is our prefix sum
        int res = 0, psum = 0;
        // we maintain a hashmap of prefix sum and its frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            psum += nums[i];
            if (map.containsKey(psum - k)) {
                // we update our res by prefix sum and not update it like a counter , to handle
                // negative values in the input
                // negative values decrease the value of the prefix sum , due to which a
                // possibilityh arises that the prefix sum
                // can appear again in future, so its better to keep a freq of psum rather than
                // update it like a counter
                res += map.get(psum - k);
                // res++;
            }
            map.put(psum, map.getOrDefault(psum, 0) + 1);

        }
        return res;
    }
}
