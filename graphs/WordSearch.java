//consider graph as undirected
public class WordSearch {
	 public boolean exist(char[][] board, String word) {    
	        for(int i=0;i<board.length;i++){
	            for(int j=0;j<board[0].length;j++){
	                if(board[i][j]==word.charAt(0)&&dfs(board,word,0,i,j)){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	    boolean dfs(char board[][],String word,int count,int i,int j){
	        if(count==word.length())
	            return true;
	        if(i==-1||i==board.length||j==-1||j==board[0].length||word.charAt(count)!=board[i][j])
	            return false;
	        char temp=board[i][j];
	        board[i][j]='$';
	        boolean  result=(dfs(board,word,count+1,i+1,j)||dfs(board,word,count+1,i-1,j)||dfs(board,word,count+1,i,j-1)||dfs(board,word,count+1,i,j+1));
	        board[i][j]=temp;
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 
}
