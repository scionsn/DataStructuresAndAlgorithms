
public class PerfectSquares {
public static int numSquares(int n) {
	  return helper(n);
    }
static int helper(int n) {
	
	if(n<0)
		return -1;
	if(n==0)
		return 0;
	int min=n;
	for(int i=1;i*i<=n;i++) {
		min=Math.min(helper(n-i*i), min);
	}
	return min+1;
	
}
	public static void main(String[] args) {
		System.out.println(numSquares(12));
	}

}
