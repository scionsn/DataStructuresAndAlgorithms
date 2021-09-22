// ref pepcoding
public class SubtractNumbByArr {
	static int arrdiff(int a1[], int a2[]) {
//	given that the value of a1 will always be greater than a2
		int final_diff = 0;
		int dif[] = new int[a1.length];
		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = dif.length - 1;
		int borrow = 0;
		while (k >= 0) {
//			this is calc for the case if our array 2 is lesser than arr 1 , then the only val
//			we consider while subtracting from arr2 are 0
			int val_at_j = j < 0 ? 0 : a2[j];
			if (a1[i] + borrow >= val_at_j) {
				int diff = 0;
//			if my val at upper array is grater than lower array then simply subtract the
//			both the values
				diff = (a1[i] + borrow) - val_at_j;
				dif[k] = diff;
			} else {
				int diff = 0;

//			if my value at upper array is lesser than that of lower array then we borrow from the prev value
//			this means that we add 10 to the current upper val and make borrow -1 so that it can decrease 
//			the value of the prev value from which our current value has borrowed.
				diff = (a1[i] + 10 + borrow) - val_at_j;
				dif[k] = diff;
				borrow = -1;
			}
			i--;
			j--;
			k--;

		}
		for (int v : dif) {
			System.out.println(v);
		}
		int power = dif.length - 1;
		int idx = 0;
		for (int e = idx; e < dif.length; e++) {
//			this loop checks if there are any leading zeores , as only leading zeroes are nt allowed,'
//			zeroes between numberrs are allowed, so as long as there are leading zaeores, keep decreasing the power
//			so as to calc the ans properly and when we find a number just break from it.
			if (dif[e] == 0) {
				power--;
				idx++;
			} else
				break;
		}
//		now calc the ans
		for (int e = idx; e < dif.length; e++) {
			int v = dif[e] * (int) Math.pow(10, power--);
			System.out.println(v);
			final_diff += v;
		}
		return final_diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = { 1, 0, 0, 0 };
		int a2[] = {7,8,9  };
		System.out.println(arrdiff(a1, a2));
	}

}
