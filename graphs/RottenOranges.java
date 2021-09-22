	import java.util.LinkedList;
//in this question we have to give the time taken(in min) for the oranges to rot.
//	class RPair{
//		int row;
//		int col;
//		RPair(int row, int col){
//			this.row= row;
//			this.col = col;
//		}
//	}
public  class RottenOranges {
	//BM
//		public static int orangesRotting(int[][] grid) {
//	        int timeTaken =-1;
//	        int rows = grid.length;
//	        int cols = grid[0].length;
//	        int freshOranges = 0;
//	        LinkedList<RPair> queue = new LinkedList<>();
//	        for(int i = 0 ; i<rows; i++) {
//	        	for(int  j = 0 ; j<cols; j++) {
//	        		// Store the Rotton Oranges in the Queue
//	        		if(grid[i][j]==2) {
//	        			queue.addLast(new RPair(i, j));
//	        		}
//	        		else
//	        		if(grid[i][j]==1) {	
//	        			freshOranges++;
//	        		}
//	        	}
//	        }
//	        int up [] = {-1,0};
//	        int right [] = {0,1};
//	        int down[] = {1,0};
//	        int left [] = {0,-1};
//	        int directions[][] = {up, right, down, left};
//	        queue.addLast(new RPair(-1, -1));
////	        -1,-1 acts as a delimiter that indicates the end of a position. 
////	        it is like a fullstop.
//	        while(!queue.isEmpty()) {
//	        	RPair pair = queue.removeFirst();
//	        	if(pair.row==-1) {
//	        		timeTaken++;
//	        		if(!queue.isEmpty()) {
//	        			queue.addLast(new RPair(-1, -1));
//	        		}
//	        	}
//	        	// Pair Rotton Orange Location (Row, Col)
//	        	for(int direction = 0; direction<directions.length; direction++) {
//	        		int neighbourRow = pair.row + directions[direction][0];
//	        		int neighbourCol = pair.col + directions[direction][1];
////	        		the below if condition handles the corner cases.
//	        		if((rows>neighbourRow && neighbourRow>=0) &&
//	        				(cols>neighbourCol && neighbourCol>=0)) {
//	        			if(grid[neighbourRow][neighbourCol]==1) {
//	        				grid[neighbourRow][neighbourCol]=2;
//	        				freshOranges--;
//	        				queue.addLast(new RPair(neighbourRow, neighbourCol));
//	        			}
//	        		}
//	        	}
//	        	
//	        }
//	        return freshOranges==0?timeTaken:-1;
	
	
	
	
	
	
//	ref codebix
	public int orangesRotting(int[][] grid) {
        LinkedList<pair> queue=new LinkedList<>();
        int total=0;
        int time=0;
        int rotten=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2||grid[i][j]==1)
                    total++;
                if(grid[i][j]==2)
                    queue.addLast(new pair(i,j));
                
            }
        }
        System.out.println(total);
        if(total==0)
            return 0;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            rotten+=size;
            if(rotten==total)
                return time;
//             after making its adjacent neighbour rotten , the time will increase by one
            time++;
            for(int i=0;i<size;i++)
            {
               
                    pair rem=queue.poll();
                    if(rem.x+1<grid.length&&grid[rem.x+1][rem.y]==1)
                    {
                        grid[rem.x+1][rem.y]=2;
                        queue.addLast(new pair(rem.x+1,rem.y));
                    }
                   if(rem.x-1>=0&&grid[rem.x-1][rem.y]==1)
                    {
                        grid[rem.x-1][rem.y]=2;
                        queue.addLast(new pair(rem.x-1,rem.y));
                    }
                   if(rem.y+1<grid[0].length&&grid[rem.x][rem.y+1]==1)
                    {
                        grid[rem.x][rem.y+1]=2;
                        queue.addLast(new pair(rem.x,rem.y+1));
                    }    
                    if(rem.y-1>=0&&grid[rem.x][rem.y-1]==1)
                    {
                        grid[rem.x][rem.y-1]=2;
                        queue.addLast(new pair(rem.x,rem.y-1));
                    }
                
            }
        }
                    return -1;


		}
	class pair
	{
	    int x;
	    int y;
	    pair(int x,int y){
	        this.x=x;
	        this.y=y;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
//		int result = orangesRotting(grid);
//		System.out.println(result);

	}
}

