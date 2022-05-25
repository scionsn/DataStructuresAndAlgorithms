// there are infinite transactions allowd
// ref - pepcoding 
// can be done by dp as well but TC increases.
// ****** this is just a question , dont compare with real life
public class BuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int selling_day_ptr = 0;
        int buying_day_ptr = 0;
        for (int i = 1; i < prices.length; i++) {
            // upstroke
            if (prices[i] >= prices[i - 1]) {
                selling_day_ptr++;
            }
            // downstroke
            else {
                // when there is a dip in price of stock we tend to sell the stock
                // at the day before
                profit += prices[selling_day_ptr] - prices[buying_day_ptr];
                buying_day_ptr = selling_day_ptr = i;

            }
        }
        // this statement is added at the end of loop to make sure that we consider the
        // case when there is an upstroke at the end of array
        // since there is no downstroke for it afterwards to add it to the profit.
        // since we calcukate our profit when there is a downstroke
        // like the case [2,3,4,1,0,4,5]
        profit += prices[selling_day_ptr] - prices[buying_day_ptr];

        return profit;
    }
}
