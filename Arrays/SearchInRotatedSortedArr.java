//return the idx of an element in a sorted arr in O(log n) using binaary search
//ref mycodeacademy
public class SearchInRotatedSortedArr {
	static int search(int elem, int arr[]) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == elem)
				return mid;
//		to check if the right half of the array is sorted frm the mid, as only one half of the arary will be sorted
			else if (arr[mid] <= arr[high]) {
//			this means that that elem exists in right half
				if (arr[mid] < elem && arr[high] >= elem) {
					low = mid + 1;
				} else
//				search in left half
					high = mid - 1;
			}
//		this means the left half is sorted, only one half of the array will be sorted after including the mid elem
			else if (arr[low] <= arr[mid]) {
				if (arr[low] <= elem && arr[mid] > elem) {
					high = mid - 1;
				} else
					low = mid + 1;
			}
		}
//	if elem is  not found
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
		System.out.println(search(3,arr));
	}

}
