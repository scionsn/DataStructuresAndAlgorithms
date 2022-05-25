// ref pepcoding

public class findPivotIdx {
    public int pivotIndex(int[] nums) {
        if (nums.length == 1)
            return 0;
// ls is left sum and rs is right sum
        int ls = 0;
        int rs = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        rs = sum;
        for (int i = 0; i < nums.length; i++) {
            rs -= nums[i];
            if (ls == rs)
                return i;
            ls += nums[i];
        }
        return -1;

    }
}
