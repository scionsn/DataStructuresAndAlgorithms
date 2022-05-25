public class jumpGame2 {
    public int jump(int[] nums) {
        // by default integer arary cintains null vals while int array contains 0 as
        // default
        Integer dp[] = new Integer[nums.length];
        dp[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            int steps = nums[i];
            // the conditiomn in the inner loop states thqt j will consider the number of
            // steps
            // from 1 to steps val but the step+current idx should not cross the array
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= steps && i + j < nums.length; j++) {
                if (dp[i + j] != null && dp[i + j] < min) {
                    min = dp[i + j];
                }
            }
            if (min != Integer.MAX_VALUE) {
                // . 1 means the 1 max jump that it will take
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }
}
