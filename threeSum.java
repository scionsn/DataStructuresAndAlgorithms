import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSumfunc(int[] nums) {
        if (nums.length <= 2)
            return new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        // sorting is imp to implement two pointer approach
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                // here we calc sum at each iteration
                int sum = nums[j] + nums[k];
                // if y+z==-x
                if (sum == (-nums[i])) {
                    // The asList() method of java.util.Arrays class is used to return a fixed-size
                    // list backed by the specified array.
                    set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }

                // if sum is more than -x then we need to decrease it , so we should add
                // something negative to it ,and since the array is sorted , so we should
                // decrease k

                else if (sum > (-nums[i]))
                    k--;
                // if sum is less than -x then we need to increase it, i.e we should add
                // something postive to it , and since the array is sorted , so we should
                // increase j
                else
                    j++;
            }
        }

        return new ArrayList<>(set);
    }
}
