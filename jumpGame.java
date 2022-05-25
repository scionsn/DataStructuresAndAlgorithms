public class jumpGame {
    public boolean canJump(int[] nums) {
        int reach = 0;
        if (nums[0] == 0)
            return false;
        for (int i = 0; i <= reach; i++) {
            reach = Math.max(reach, i + nums[i]);
            if (reach >= nums.length - 1)
                return true;
        }
        return false;
    }
}
