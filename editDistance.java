public class editDistance {
    public int minDistance(String word1, String word2) {
        // return helper(word1,word2,0,0);
        return helper_dp(word1, word2);
    }

    int helper(String str1, String str2, int i, int j) {

        if (i >= str1.length()) {
            // return the length of the string from the pt where j is currently
            // becsause ideally if i reaches end or lets say string1 is empty,
            // then the min operations is the length of str2 from jth idx
            // can be easily seen in a recursice call
            return str2.substring(j).length();
        }
        if (j >= str2.length())
            return str1.substring(i).length();
        if (str1.charAt(i) == str2.charAt(j)) {
            return helper(str1, str2, i + 1, j + 1);
        } else {
            // we add 1 to. count the number of operations
            int insert = helper(str1, str2, i, j + 1) + 1;
            int delete = helper(str1, str2, i + 1, j) + 1;
            int replace = helper(str1, str2, i + 1, j + 1) + 1;
            // we compare the three operartions as to who gives the minimum result
            int comp = Math.min(insert, delete);
            int min = Math.min(comp, replace);
            return min;
        }

    }

    int helper_dp(String str1, String str2) {
        int dp[][] = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                // if len of str1 is 0 then min operations is len of str2 and vice versa
                if (i == 0) {

                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                }

                else {
                    if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                        // since the char of the strings match, so we now have to cehck the min number
                        // of operations to make str1 equal to str2 till idx str1(i-1),str2(j-1).
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        // insert
                        int ins = dp[i][j - 1] + 1;
                        // delete
                        int del = dp[i - 1][j] + 1;
                        // replace
                        int repl = dp[i - 1][j - 1] + 1;
                        // comparing all three opearations
                        dp[i][j] = Math.min(Math.min(ins, del), repl);
                    }

                }
            }
        }
        return dp[str1.length()][str2.length()];

    }
}