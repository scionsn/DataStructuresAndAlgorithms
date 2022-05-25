// ref- techddose
public class kadensAlgo {
    static long maxSubarraySum(int arr[], int n) {

        // Your code here
        // msf=max so far,mth= max till here
        int msf = Integer.MIN_VALUE;
        int mth = 0;
        for (int i = 0; i < arr.length; i++) {
            mth += arr[i];
            mth = Math.max(mth, arr[i]);
            // System.out.println(mth);
            msf = Math.max(msf, mth);
        }
        return msf;
    }
    public static void main(String[] args) {
        int arr[]={3,-1,5,7,2};
        System.out.println(maxSubarraySum(arr, 5));
    }
}
