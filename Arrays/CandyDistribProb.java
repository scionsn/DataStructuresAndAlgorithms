
//ref techdose
import java.util.Arrays;

public class CandyDistribProb {
	public int candy(int[] ratings) {
		if (ratings.length == 0)
			return 0;
		int candies = 0;
		int[] res = new int[ratings.length];
		Arrays.fill(res, 1);
//		checking fromm left to right, if current is greater than prev then increase curr by 1
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				res[i] = res[i - 1] + 1;
			}

		}
// checking from right to left from N-2 to 0, if current is greater than next and then 
//		comparing the l2r and r2l left and taking max of it , since we have to takee the worst case
//		it could be done using two arrays, bt we do it using one saving space
		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				res[i] = Math.max(res[i], res[i + 1] + 1);
			} else
				res[i] = Math.max(res[i], 1);
		}
//adding values in the result , to get the count of candies
		for (int i : res)
			candies += i;
		return candies;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
