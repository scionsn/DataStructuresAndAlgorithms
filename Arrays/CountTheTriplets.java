import java.util.Arrays;

//ref gfg
//count the triplets  such that a[i]<b[j]<c[k]
public class CountTheTriplets {
	static int CountElemLesser(int a[], int elem) {
		int low = 0;
		int high = a.length - 1;
		int idx = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] < elem) {
				low = mid + 1;
				idx = mid;
			} else {
				high = mid - 1;
			}
		}
//		here we return idx+1 since its a sorted array, so if ith element is lesser than middle
//		 then the elements before it will also be lesser than it , as the aray is sorted
		return idx + 1;
	}

	static int CountElemGreater(int[] c, int elem) {
		int low = 0;
		int high = c.length - 1;
		int idx = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (c[mid] < elem) {
				low = mid + 1;
			} else {
				high = mid - 1;
				idx = mid;
			}
		}
//	 here we return length-idx as if say the element greater than middle one is at 0 index
//		then all the remaining elem will be greater than middle as the array is sorted
//		so the count is arr length-0.
		return (c.length-idx);
	}

	static int Util(int a[], int b[], int c[]) {
//		sorting the arrays first so as to implement binary search, 
//		to find elements greater than current elem at b
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			int counta = CountElemLesser(a, b[i]);
			int countc = CountElemGreater(c, b[i]);
			System.out.println(counta+countc);
			count += (counta * countc);
//			System.out.println(count);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 1, 1 };
		int b[] = { 2, 2, 2 };
		int c[] = { 3, 3, 3 };
System.out.println(Util(a,b,c));
	}

}
