import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Consider a rat placed at (0, 0) in a square matrix of order N*N.
//It has to reach the destination at (N-1, N-1). Find all possible
//paths that the rat can take to reach from source to destination. 
//The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). 
//Value 0 at a cell in the matrix represents that it is blocked
//and cannot be crossed while value 1 at a cell in the
//matrix represents that it can be traveled through.
public class RatMazeII {
	static int visited[][];
	static ArrayList<String> res=new ArrayList<>();

	public static ArrayList<String> printPath(int[][] m, int n) throws Exception {
		try {
		visited=new int[n][n];
		Arrays.fill(visited,0);
		}
		catch(Exception e) {
			
		}
		 	helper(m,n,0,0,n-1,n-1,"");
		 	Collections.sort(res);
		 	return res;
	}
	static ArrayList<String> helper(int[][] m,int n,int row,int col,int endrow,int endcol,String dir){
		
		if(row==endrow&&col==endcol&&m[row][col]==1) {
			res.add(dir);
			return res;
		}
		if(row>n||col>n||row<0||col<0) {
		return res;	
		}
		if(m[row][col]==0) {
			return res;
		}
	
		visited[row][col]=1;
//		down
		helper(m,n,row+1,col,endrow,endcol,dir+"D");
//		right
		helper(m,n,row,col+1,endrow,endcol,dir+"R");
//		left
		helper(m,n,row,col-1,endrow,endcol,dir+"L");
//		up
		helper(m,n,row-1,col,endrow,endcol,dir+"U");
//		backtracking code , if we are unable to make any of the four calls above.
		visited[row][col]=0;	
		return res;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int arr[][]= {
				{1, 0, 0, 0},
            {1, 1, 0, 1}, 
            {1, 1, 0, 0},
            {0, 1, 1, 1}};
	System.out.println(printPath(arr,arr.length));
	}

}
