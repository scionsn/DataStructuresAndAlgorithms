import java.util.HashMap;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class twoSumLC {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                res[0] = i;
                res[1] = map.get(diff);
            } else
                map.put(nums[i], i);

        }
        return res;
    }
}
