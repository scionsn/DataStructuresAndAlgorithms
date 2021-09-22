//ref mycodeschool
// TC O(NLOGN) ALL CASES
public class MergeSort {
	static void Mergehalves(int arr[], int left[], int right[]) {
		int i = 0, j = 0, k = 0;
//	i points to left and j to right and k to main array
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
//	after this loop ends it might be the case that one of our left or right arrays have exhausted
//	but one of them still remains untraversed, inn that case just take thar array put put all its
//	elements in thhe main array
		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;

		}
		while (j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

	static void sort(int arr[]) {
//	as single element is always sorted
		if (arr.length < 2) {
			return;
		}
		int mid = arr.length / 2;
		int left[] = new int[mid];
		int right[] = new int[arr.length - mid];
//	putting the elements till mid in left array 
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
//	putting the elements after mid and till last index in right array
		for (int i = mid; i < arr.length; i++) {
//		i-mid helps prevents overflow as right is also of size 4 but the index we input
//		is greater than its length so we subtract it from mid to put it in appropriate index.

			right[i - mid] = arr[i];
		}
		sort(left);
		sort(right);
//	for every subproblem merge the left and right halves into a sorted array
		Mergehalves(arr, left, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 4, 6, 8, 5, 3, 7 };
		sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
