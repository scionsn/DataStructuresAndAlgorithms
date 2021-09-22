//Alice and Bob take turns playing a game, with Alice starting first.
//
//Initially, there are n stones in a pile.  On each player's
//turn, that player makes a move consisting of removing any non-zero square number of stones in the pile.
//
//Also, if a player cannot make a move, he/she loses the game.
//
//Given a positive integer n. Return True if and only if Alice wins the game otherwise return False, assuming both players play optimally.
public class StoneGameIV {
	  public boolean winnerSquareGame(int n) {
		  Boolean memo[]=new Boolean[100001];
	      if(n==0)
		return false;
	        if(memo[n]!=null)
	            return memo[n];
	for(int i=1;i*i<=n;i++) {
//		this  call is being made to the next player and if the next player isnt able to pick stones
//		this means that the other player wins the game, so we return true
		if(!winnerSquareGame(n-i*i)) {
	       return memo[i]=true;
		}
	}
	return memo[n]=false;

	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
