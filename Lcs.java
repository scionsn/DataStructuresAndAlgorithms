// ref - abdul.b
public class Lcs {
    public static int lcs_recur(String text1, String text2) {
        return helper(text1, text2, 0, 0);
    }

    static int helper(String text1, String text2, int i, int j) {
        if (i == text1.length() || j == text2.length()) {
            return 0;

        }
        if (text1.charAt(i) == text2.charAt(j)) {
            // increase the len of res by 1 in case of match
            return 1 + helper(text1, text2, i + 1, j + 1);
        } else {
            int mismatch_inc1 = helper(text1, text2, i + 1, j);
            int mismatch_inc2 = helper(text1, text2, i, j + 1);
            int comp = Math.max(mismatch_inc1, mismatch_inc2);
            return comp;
        }
    }

    public static int lcs_dp(String text1, String text2) {

        int len1 = text1.length();
        int len2 = text2.length();

        int dp[][] = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                // //if len of string 1 is 0, the lcs is also 0
                // if(i==0)
                // dp[i][j]=0;
                // //if len of string 2 is 0, the lcs is also 0

                // else if(j==0)
                // dp[i][j]=0;

                if (text1.charAt(i - 1) != text2.charAt(j - 1)) {
                    int lcs_prev1 = dp[i][j - 1];
                    int lcs_prev2 = dp[i - 1][j];
                    dp[i][j] = Math.max(lcs_prev1, lcs_prev2);
                } else {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(lcs_recur("text1", "text2"));
        System.out.println(lcs_dp("text1", "text2"));
    }
}
