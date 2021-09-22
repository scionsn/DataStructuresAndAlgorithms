//Given a 2D binary matrix filled with 0's and 1's, 
//find the largest square containing only 1's and return its area.


public class MaximalSquare {
	public static int maximalSquare(char[][] matrix) {
		int k=0;
		int curr=0;
		int max=0;
for(int i=0;i<matrix.length;i++) {
	for(int j=0;j<matrix.length;j++) {
		curr=helper(matrix,i,j);
		if(max<curr) {
			max=curr;
		}
	}
}
return max*max;

	}
	static int helper(char[][] arr,int i,int j) {
		if(i>=arr.length||j>=arr[0].length||arr[i][j]=='0')
			return 0;
//		if(memo[i][j]!='0') {
//			return memo[i][j];
//		}
		int right=helper(arr,i,j+1);
		int	 down=helper(arr,i+1,j);
		int diagnol=helper(arr,i+1,j+1);
		int init=Math.min(right, down);
		int res=Math.min(init, diagnol);
		return 1+res;
//		return memo[i][j]; 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] =
			{
					{'1','0','1' ,'0','0'},
					{'1','0','1','1','1'},
					{'1','1','1','1','1'},
					{'1','0','0','1','0'}
			};

		System.out.println("max area of square is "+maximalSquare(arr));
	}

}
