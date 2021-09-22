
public class CoinChangeTwo {
	 public static int change(int amount, int[] coins) {
		 int memo[][]=new int[coins.length+1][amount+1];
	        return helper(amount,coins,0,memo);
	    }
	static int helper(int amount,int coins[],int index,int memo[][])
	 {
		 if(amount==0)
			 return 1;
		 if(amount<0)
			 return 0;
		 if(memo[index][amount]!=0)
			 return memo[index][amount];
		 int res=0;
		 for(int i=index;i<coins.length;i++)
		 {
			 if(coins[i]<=amount)
			 {
				 res+=helper(amount-coins[i],coins,i,memo);
			 }
		 }
		 memo[index][amount]=res;
		 return res;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3};
int amt=6;
System.out.println(change(amt,arr));
	}

}
