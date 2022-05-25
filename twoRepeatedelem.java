public class twoRepeatedelem {
    public static int[] twoRepeated(int arr[]) {
        int res[] = new int[2];
        int j = 0;
        // Your code here
        for (int i = 0; i < arr.length; i++) {
            int idx = Math.abs(arr[i]);
            if (arr[idx] > 0)
                arr[idx] = -1 * arr[idx];
            else
                res[j++] = idx;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 3 };
        for (int i : twoRepeated(arr))
            System.out.println(i);
    }
}
