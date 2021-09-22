//return the minimum number of operations insert , delete,replace to be performed
// to convert word1 to word2
public class EditDistance {
	public static int minDistanceRecur(String word1, String word2) {
		return helper( word1,  word2,word1.length()-1,word2.length()-1);

	}
	static int helper(String word1,String word2,int i,int j) {
		if(i==0)
			return j;
		if(j==0)
			return i;
		if(word1.charAt(i)==word2.charAt(j))
			return helper(word1,word2,i-1,j-1);
		return 1+Math.min(helper(word1,word2,i,j-1), Math.min(helper(word1,word2,i-1,j), helper(word1,word2,i-1,j-1)));
			

	}
	
	public static int minDistanceDP(String word1, String word2) {
int m=word1.length();
int n=word2.length();
int dp[][]=new int[m+1][n+1];
for(int i=0;i<=m;i++) {
for(int j=0;j<=n;j++) {
	if(i==0)
		dp[i][j]=j;
	else if(j==0)
		dp[i][j]=i;
	else if(word1.charAt(i-1)==word2.charAt(j-1)) {
		dp[i][j]=dp[i-1][j-1];
	}
	else
		dp[i][j]=1+Math.min(dp[i-1][j], Math.min(dp[i][j-1],dp[i-1][j-1]));
} 
}
return dp[m][n];
	}
	public static  void main(String[] args) {
String s1="xyzabc";
String s2="ac";
System.out.println(minDistanceRecur(s1,s2));
System.out.println(minDistanceDP(s1,s2));

	}
}
