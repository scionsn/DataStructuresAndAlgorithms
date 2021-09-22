
public class MinCostPath {
static int meth(int arr[][],int m,int n) {
	if(m<0||n<0)
		return Integer.MAX_VALUE;
	else if(m==0&&n==0) {
		return arr[m][n];
	}
		int up=meth(arr,m-1,n);
	int  left=meth(arr,m,n-1);
	int diag=meth(arr,m-1,n-1);
	int res=Math.min(up, left);
	
	return arr[m][n]+Math.min(res, diag);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{2,0,6},{3,1,7},{4,5,9}};
System.out.println(meth(arr,2,2)); 

	}

}
