
//similar to subset sum problem
class Knapsack01 {
    public static void main(String[] args) {
        int k_wt = 50;
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        System.out.println(knapsackhelper(k_wt, val, wt, 0));
        System.out.println(tab(val, wt, k_wt));

    }

    public static int knapsackhelper(int k_wt, int val[], int wt[], int i) {
        if (i == wt.length || k_wt == 0) {
            return 0;
        } else if (wt[i] > k_wt)
            return knapsackhelper(k_wt, val, wt, i + 1);
        int incl_wt = val[i] + knapsackhelper(k_wt - wt[i], val, wt, i + 1);
        int exclud_wt = knapsackhelper(k_wt, val, wt, i + 1);
        int res = Math.max(incl_wt, exclud_wt);
        return res;

    }

    public static int tab(int val[], int wt[], int k_wt) {
        int dp[][] = new int[wt.length + 1][k_wt + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i - 1] > k_wt) {
                    // if our wt is greater than the capcity in knaosack then we cant include that
                    // weight and so
                    // we will consider the previous weights and their value
                    dp[i][j] = dp[i - 1][j];
                }
                // if the wieght is less than the capacity of knapsack then there are two
                // options,
                // ewither to include or not to
                // if we include the wt, then obv the capacity of the knapsach will be reduced
                // by that weight,
                // then we will check if j - wt[j-wt[i-1]], here we will check if the prev
                // elements are able to
                // to be contained in the reduced capacity of the knapsack, (j-wt[i-1]) means check the value from the previous
                //  elements.
                // and if we exclude that weight then we will cehck if the previous elements are
                // able to fill the capacity
                else if (wt[i - 1] <= j) {
                    int incl = val[i - 1] + dp[i - 1][j - wt[i - 1]];
                    int excl = dp[i - 1][j];
                    dp[i][j] = Math.max(incl, excl);
                }
            }
        }
        return dp[wt.length][k_wt];
    }

}
