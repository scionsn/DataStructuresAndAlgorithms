 //Say you have an array for which the ith element is the price of a given stock on day i.
//
//If you were only permitted to complete at most one transaction
//(i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//Note that you cannot sell a stock before you buy one.
public class BestTimeToBuyAndSell {
	 public static int maxProfit(int[] prices) {
	   
	   if(prices.length==0)
		   return 0;
	   int minstock=prices[0];
	   int maxprofit=0;
	   for(int i=0;i<prices.length;i++) {
		   minstock=Math.min(minstock,prices[i]);
		   maxprofit=Math.max(maxprofit, Math.abs(prices[i]-minstock));
	   }
	   return maxprofit;

	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,1,5,6,3,4};
		System.out.println(maxProfit(arr));

	}

}
