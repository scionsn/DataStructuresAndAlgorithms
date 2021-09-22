import java.util.ArrayList;
import java.util.List;

public class AllSubsetsWithGivenSum {
	static List<List<Integer>> res = new ArrayList<>();

	static List<List<Integer>> subsetsWithSum(int arr[], int sum) {
		List<Integer> sub = new ArrayList<>();
		meth(sub, arr, sum, 0);
		return res;
	}

	static void meth(List<Integer> sub, int arr[], int sum, int i) {
		if (sum == 0) {
			res.add(new ArrayList<>(sub));
			return;
		}
		if (sum < 0 || i >= arr.length)
			return;
		sub.add(arr[i]);
		meth(sub, arr, sum - arr[i], i + 1);
//		backtrack, perform pruning(some changes)
		sub.remove(sub.size() - 1);
		meth(sub, arr, sum, i + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 5, 8, 4, 6, 11 };
		int sum = 13;
		System.out.println(subsetsWithSum(arr, sum));

	}

}
