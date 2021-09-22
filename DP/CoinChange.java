
public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		 if (amount==0)
	            return 0;
	        int min_coins=Integer.MAX_VALUE;
	        for(int coin:coins){
//	        	we add one to include the denomination from the  given array
	            if(coin<=amount)
	           min_coins= 1+Math.min(coinChange(coins,amount-coin),min_coins);
	        }
	        return min_coins;
	    }
}
