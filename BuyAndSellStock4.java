//ref-pepcoding
public class BuyAndSellStock4 {
    public static void main(String[] args) {
        int arr[] = { 6, 1, 3, 2, 4, 7 };
        System.out.println(maxProfit(arr, 2));
    }

    // each subproblem stores the max profit that we can earn by i transacn under j
    // days.
    static int maxProfit(int prices[], int k) {
        if (prices.length == 0)
            return 0;
        int dp[][] = new int[k + 1][prices.length];
        for (int i = 1; i < dp.length; i++) {
            // when i=0 => no trnscn so 0 profit, when j=0=> no day so 0 profit
            for (int j = 1; j < prices.length; j++) {
                // j=1 indicates that when we have one 1 day, whats the max profit we can
                // generate,
                // from k=1 to n , if we only have one day then the max profit we can gain is 0,
                // that
                // is buy and sell on that same day since if we only buy at that day then we
                // dont
                // have any other day to sell

                // we see if till prev day , we have completed k transaction ,and what is the
                // profit from those k transactions.
                int max_prof_till_prevday_same_trnscn = dp[i][j - 1];
                // then we see what is the profit we make till prev day if well compleete k-1
                // transaction, since we cmplete k-1 transacn,
                // then there are still 1 transaction remaining that can be done bw the curent
                // day and the prev day , i.e sell at current day
                // and buy at some prev day, now we will see if we can gain some profit by
                // selling at jth day and buying at some j-1th day
                // with this we also take into account what is th max profit we made till that
                // k-1 trnsacn, sine that will be added with the
                // current trasacntion.
                int max = 0;
                for (int pd = 0; pd < j; pd++) {
                    int val = prices[j] - prices[pd];
                    int prof_till_prev_days_onelesstrsncn = dp[i - 1][pd];
                    int sum = val + prof_till_prev_days_onelesstrsncn;
                    int compare = Math.max(sum, max_prof_till_prevday_same_trnscn);
                    // the max here stores the max profit that we can earn upto the jth day till ith
                    // trasaction
                    max = Math.max(compare, max);
                    dp[i][j] = max;
                }
            }
        }
        return dp[k][prices.length - 1];
    }
}
