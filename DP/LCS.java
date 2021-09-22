
public class LCS {
static int i=0;
public static int lcs(String m,String n) {
	if(m.length()==0||n.length()==0) {
		return 0;
	}
	if(m.charAt(0)==n.charAt(0)) {
		return 1+lcs(m.substring(1),n.substring(1));

	}
	else {
		return Math.max(lcs(m.substring(1),n), lcs(m,n.substring(1)));
	}
}
static int memo(String first,String sec,int m,int n,int cache[][]) {
	if(m==0||n==0)
		return 0;
	if(cache[m-1][n-1]!=0)
		return cache[m-1][n-1];
	
	if(first.charAt(m-1)==sec.charAt(n-1))
		return 1+memo(first,sec,m-1,n-1,cache);
	else
		cache[m-1][n-1]=Math.max(memo(first,sec,m-1,n,cache), memo(first,sec,m,n-1,cache));
		return cache[m-1][n-1]; 
	
}
static int tab(String first,String sec) {
	int m=first.length();
	int n=sec.length();
	int arr[][]=new int[m+1][n+1];
	for(int i=0;i<=m;i++) {
		for(int j=0;j<=n;j++) 
		{
			if(i==0||j==0) {
				arr[i][j]=0;
			}
			else if(first.charAt(i-1)==sec.charAt(j-1)) {
				arr[i][j]=1+arr[i-1][j-1];
			}
		
		else {
			arr[i][j]=Math.max(arr[i][j-1], arr[i-1][j]);
		}
		}
//			System.out.println(str);
	}
//	print
	for(int i=0;i<=m;i++) {
		for(int j=0;j<=n;j++) {
			System.out.println(arr[i][j]);
		}
	}
	return arr[m][n];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcd";
String s2="badc";
int arr[][]=new int[s1.length()][s2.length()];
//System.out.println(lcs(s1,s2));
//System.out.println(memo(s1,s2,s1.length(),s2.length(),arr));
//System.out.println("output is"+tab(s1,s2));
lcs(s1,s2);
	}
}
