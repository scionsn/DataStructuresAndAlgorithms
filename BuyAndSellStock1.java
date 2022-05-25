// ref - pepcoding
public class BuyAndSellStock1 {
    // at most one transaction allowed
    //greedy method.
    // dp is also possible but wil result in n^2 TC
    public int maxProfit(int[] prices) {
        if(prices.length==1)
            return 0;
            int maxProfit=Integer.MIN_VALUE;
            int minStock=prices[0];
            
            for(int i=1;i<prices.length;i++)
            {
                minStock=Math.min(prices[i],minStock);
                maxProfit=Math.max(maxProfit,prices[i]-minStock);
                
            }
            return maxProfit;
        
        }
}
