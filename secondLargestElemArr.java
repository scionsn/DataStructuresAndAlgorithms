public class secondLargestElemArr {
    public static int print2largest(int A[], int N) {

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            // if current elem is greater than first then just make second eqal to first and
            // first to that current elem
            if (A[i] > first) {
                second = first;
                first = A[i];
            }
            // if current elem lies bw first and second then make second equal to that
            // curent elem
            else if (A[i] > second && A[i]< first) {
                second = A[i];
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;

    }
}
