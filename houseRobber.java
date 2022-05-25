// house robber or max sum of non adjacent elements
public class houseRobber {
    public int rob(int[] nums) {
        return helper(nums, 0);
    }

    int helper(int[] money, int i) {
        if (i >= money.length)
            return 0;
        int rob = money[i] + helper(money, i + 2);
        int n_rob = helper(money, i + 1);
        return Math.max(rob, n_rob);
    }

    public int rob2(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        // each index in dp stores the maximum value of non adjacent elements till that
        // index
        for (int i = 2; i < dp.length; i++) {
            // either include val till prev index or from curent idx to curerent-2 , as adj
            // isnt allowed
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}
