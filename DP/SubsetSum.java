
public class SubsetSum {
static boolean meth(int arr[],int sum,int n) {
	if(sum==0)
		return true;
	 if(sum>0&&n==0)
		return false;
if(sum<0&&n==0)
{
	return false;
}
	 if(arr[n-1]>sum) {
		return meth(arr,n-1,sum);
	}
//	one time we include in sum and the other time we not .
	return meth(arr,n-1,sum)||meth(arr,n-1,sum-arr[n-1]);
	
}
static boolean tab(int arr[],int sum,int n)
{
	boolean dp[][]=new boolean[n+1][sum+1];
	for(int i=0;i<dp.length;i++)
	{
		dp[i][0]=true;
		
	}
	for(int i=1;i<dp[0].length;i++)
	{
		dp[0][i]=false;
	}
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=sum;j++)
		{
			if(arr[i-1]>j) {
				dp[i][j]=dp[i-1][j];
			}
			else if(arr[i-1]<=j)
			{
				dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
			}
		}
	}
	return dp[n][sum]; 
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,1,5,2};

int sum=4 ;
System.out.println(meth(arr,sum,arr.length));
System.out.println(tab(arr,sum,arr.length));

//System.out.println(meth2(arr,sum,arr.length));
	}

}
