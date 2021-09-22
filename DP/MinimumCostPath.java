
public class MinimumCostPath {
	 public int minPathSumRecur(int[][] grid) {
		    
	       return   helper(grid,0,0,grid.length-1,grid[0].length-1);
	    }
	    int helper(int[][] grid,int i,int j,int endrow,int endcol){
	        if(i==endrow&&j==endcol)
	            return grid[endrow][endcol];
	        if(i>endrow||j>endcol)
	            return Integer.MAX_VALUE;
	      int down= helper(grid,i+1,j,endrow,endcol);
	        int right=helper(grid,i,j+1,endrow,endcol);
	        return grid[i][j]+Math.min(down,right);
	        
	    }
	    public int minPathSumDP(int[][] grid) {
	    	   int row=grid.length;
	           int col=grid[0].length;
	           int dp[][]=new int[row][col];
//	            putting the value of the cell where we have to reach
	           dp[row-1][col-1]=grid[row-1][col-1];
//	            our row size and col size should be atleast greater than one
//	            entering info for last row as it can only move in right direction
	           if(col>1){
	               for(int j=col-2;j>=0;j-- ){
	                   dp[row-1][j]=grid[row-1][j]+dp[row-1][j+1];
	               }
	           }
	           //         entering info for last col as it can only move in down direction
	           if(row>1){
	               for(int i=row-2;i>=0;i--){
	                   dp[i][col-1]=grid[i][col-1]+dp[i+1][col-1];
	               }
	           }
//	            entering for remainig matrix
	           for(int i=row-2;i>=0;i--){
	               for(int j=col-2;j>=0;j--){
	                   dp[i][j]=grid[i][j]+Math.min(dp[i][j+1],dp[i+1][j]);
	               }
	               
	           }
	           return dp[0][0];

	       }
}
	    
