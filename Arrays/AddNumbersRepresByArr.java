//ref pepcoding
public class AddNumbersRepresByArr {
	static int ArraySum(int a1[], int a2[]) {
		int ans[] = new int[a1.length > a2.length ? a1.length : a2.length];
		int i = a1.length-1;
		int j = a2.length-1;
		int k = ans.length-1;
		int carry = 0;
		while (k >= 0) {
			int sum = 0;
//if we have first arr remaining then add in the current sum
			if (i >= 0) {
				sum += a1[i];
			}
			if (j >= 0) {
				sum += a2[j];
			}
			sum += carry;
			carry = sum / 10;
			ans[k] = sum % 10;
			i--;
			j--;
			k--;
		}
		int power = ans.length;
		int val = 0;
// if carry is 1 , then we have to include that final 1 in our sum
		if (carry == 1) {
			val += 1 * Math.pow(10, power--);
			for (int elem : ans) {
				val += elem * Math.pow(10, power--);
			}
		} else {
			power = ans.length - 1;
			for (int elem : ans) {
				val += elem * Math.pow(10, power--);
			}

		}
		return val;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = { 9, 9, 9,9 };
		int a2[] = { 2, 3, 4 };
		System.out.println(ArraySum(a1, a2));
	}
}
