//ref- gfg
class MinMergeOpToMakeArrPalin {
	static int func(int arr[]) {
		int res = 0;
		if (arr.length == 0 || arr.length == 1) {
			return 0;
		}
		for (int i = 0, j = arr.length - 1; i <= j;) {
//		if both are same then no merge oper
			if (arr[i] == arr[j]) {
				i++;
				j--;
			}
//  if element at i idx is greater than element at j index, then 
// we need to add elem at j and j-1 , j-1 becasue we are decreasing j
// we add these two so as to maybe make them palind, so we add lesser elements together
//and not the one which is alreaddy greater.
			else if (arr[i] > arr[j]) {
				j--;
				arr[j] += arr[j + 1];
				res++;
			} else {
				i++;
				arr[i] += arr[i - 1];
				res++;
			}
		}
		for (int i : arr)
			System.out.println(i);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 4, 5, 1 };
		System.out.println("res is:" + func(arr));
	}

}
