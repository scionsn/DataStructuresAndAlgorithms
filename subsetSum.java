//ref techdose.


public class subsetSum {
    public static void main(String[] args) {
        int arr[] = { 1,7,3,11 };
        int sum = 9;
        System.out.println(subsetSumProb(arr, sum, 0));
        // System.out.println(tab(arr, sum));

    }
// TC O(2^n)
    static boolean subsetSumProb(int arr[], int sum, int i) {
        if (sum == 0) {
            return true;
        }   

        else if (i == arr.length && sum < 0) {
            return false;
        }
            else if(sum<0)
            return subsetSumProb(arr, sum, i + 1);

         else if (i == arr.length && sum > 0)
            return false;

        boolean incl_in_sum = subsetSumProb(arr, sum - arr[i], i + 1);
        boolean not_incl = subsetSumProb(arr, sum, i + 1);
        // we do an or operation , we either inc it in sum or we dont include in sum,
        // so we do an or so that if either one of the branches return true, then we
        // want to reflect that true in our answer.
        // then t||f will return true for that.
        // t||t =t
        return incl_in_sum || not_incl;
    }
// TC O (n*sum) space O(n*sum) time
    static boolean tab(int arr[], int sum) {
        boolean dp[][] = new boolean[arr.length + 1][sum + 1];
// its possible to make 0 sum from n elements, i.e by not including any of the elements or taking an empty set
        for (int i = 0; i < dp.length; i++) {
            dp[i++][0] = true;
        }
        // its not possible to make sum from 1 to sum value with 0 elements. 
        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j++] = false;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                // if current element has value greater than ‘current sum value’, then we will
                // not include that current element
                // and so we will check if the previous elem were able to prodice that sum, and
                // so we will copy
                // the answer from the previous cases that we just calculated
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
                // if the current element is lesse than the sum , then there are two cases ,
                // either we can exclude the current element from the sum or we can include that
                // current element like we did in the recursie call
                // if we exclude that element then just check if the previous elements were able
                // to prodiuce that sum
                // if we include that elememt then we check the value at j-arr[i-1], to check if
                // prev elements are able
                // to produce the differnece , we will take an OR of both these cases like we
                // did in reciursice call
                // and then return then answer.
                else if (arr[i - 1] <= j) {
                    boolean excl = dp[i - 1][j];
                    boolean incl = dp[i - 1][j - arr[i - 1]];
                    dp[i][j] = incl || excl;

                }
            }
        }
        return dp[arr.length][sum];

    }
}
