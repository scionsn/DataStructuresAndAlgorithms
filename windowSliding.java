public class windowSliding {
    static void dynamic() {
		int arr[] = { 3, 10, 2, 1, 5, 6, 2, 1, 9, 7 };
		int target = 15;
		int windowStart = 0;
		int currentSum = 0;
		int maxWindowSize = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			while (currentSum >= target) {
				int currentWindowSize = i - windowStart + 1;
				maxWindowSize = Math.max(maxWindowSize, currentWindowSize);
				currentSum = currentSum - arr[windowStart];
				windowStart++;

			}
		}
		System.out.println("Min Window Size Sum " + maxWindowSize + "sum " + currentSum);
	}

	static void fixed(int windowSize) {
		int arr[] = { 3, 10, 2, 1, 5, 6, 2, 1, 9, 7 };
		int max = Integer.MIN_VALUE;
		int currentSum = 0;
		int windowRange = windowSize;
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			if (i >= windowRange - 1) {
				max = Math.max(max, currentSum);
				currentSum = currentSum - arr[i - (windowRange - 1)];
			}
		}
		System.out.println("Max Sum is " + max);
	}
    public static void main(String[] args) {
        fixed(4);
        //		fixed(3);
        //		fixed(2);
                dynamic();    }
}
