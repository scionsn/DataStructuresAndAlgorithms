
public class NqueensProb {
//	1st approach
	static boolean isAllowToPlace(boolean board[][], int currentRow, int currentCol) {
		// Above Row
		for(int i = currentRow;i>=0; i--) {
			if(board[i][currentCol]) {
				return false;
			}
		}
		// Same Row
		int totalCols = board[0].length;
		for(int i = 0; i<totalCols; i++) {
			if(board[currentRow][i]) {
				return false;
			}
		}
		// right
		for(int i = currentRow, j = currentCol; i>=0 && j<board.length; i--, j++) {
			if(board[i][j]) {
				return false;
			}
		}
		// Left
		for(int i = currentRow, j = currentCol; i>=0 && j>=0; i--, j--) {
			if(board[i][j]) {
				return false;
			}
		}
		return true;
	}
	static int possibleQueenBoardArrangement(boolean board[][]	, int currentRow){
		int count = 0;
		if(currentRow == board.length) {
			return 1;
		}
		for(int col= 0; col<board[currentRow].length; col++) {
			if(isAllowToPlace(board, currentRow, col)) {
				board[currentRow][col] = true;
				count = count + possibleQueenBoardArrangement(board,currentRow+1);
				board[currentRow][col] = false;
			}
		}
		return count;
	}
//	2nd approach 
	static void possible_ways(boolean board[][]) {
		boolean column[]=new boolean[board[0].length];
		boolean diag[]=new boolean[2*board.length-1];
		boolean revdiag[]=new boolean[2*board.length-1];
print_pos(board,0,column,diag,revdiag," ");
	}
	
static void print_pos(boolean board[][],int row,boolean column[],boolean diag[],boolean revdiag[],String position) {
if(row==board.length) {
	System.out.println(position+", ");
	return ;
}
for(int col=0;col<board.length;col++) {
	if(column[col]==false&&diag[row+col]&&revdiag[row-col+board.length-1]) {
		board[row][col]=true;
		column[col]=true;
		diag[row+col]=true;
		revdiag[row-col+board.length-1]=true;
		print_pos(board,row+1,column,diag,revdiag,position+row+"-"+col+" , ");
//		backtrack to undo the last incorrect answer, if we are not able to place all the queens.
		board[row][col]=false;;
		column[col]=false;;
		diag[row+col]=false;
		revdiag[row-col+board.length-1]=false;
		
	}
}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[][]= new boolean[4][4];
		int result = possibleQueenBoardArrangement(board,0);
		System.out.println(result);
		possible_ways(board);

	}

}
