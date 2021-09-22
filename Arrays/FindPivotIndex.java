//keep a left array which keeps the sum of elements from left to right.
//then we find the sum from right to left ,if the value in left to right sum array and our sum matches ,
//then we have found our pivot index.
public class FindPivotIndex {
	public static int pivotIndex(int[] nums) {
		int left_to_rightsum[] = new int[nums.length];
		int sum = 0;
		int idx = -1;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			left_to_rightsum[i] = sum;
		}
		sum = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			sum += nums[i];
			if (sum == left_to_rightsum[i])
				idx = i;

		}
		return idx;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, -1 };
		System.out.println("pivot index-->"+pivotIndex(arr));
	}
}
