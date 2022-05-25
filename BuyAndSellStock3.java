// at most two transactions are allowed
// ref- pepcoding
public class BuyAndSellStock3 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int min_stock = prices[0];
        int max_profit_sell_till_theday[] = new int[prices.length];
        max_profit_sell_till_theday[0] = 0;
        // we first calculate the max_profit by consideringwhat will be the max profit
        // if (sell at that day or till that day)
        // max profit can be made if we find a price lesser than the current stock price
        // so that we can sell at the current day.

        // ****** this is calcualted for every stock price only from left to right.
        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < min_stock) {
                min_stock = prices[i];
            }
            max_profit_sell_till_theday[i] = Math.max(prices[i] - min_stock, max_profit_sell_till_theday[i - 1]);
        }

        int max_profit_buy_till_theday[] = new int[prices.length];
        int max_stock = prices[prices.length - 1];
        max_profit_buy_till_theday[prices.length - 1] = 0;
        // here we calculate what will be the maximum profit if we (buy at this day or
        // after this day),
        // and sell it in the future. for this we traverse the array in backwr manner,
        // so that we can keep track of the max_stock
        // so if we have a currrent stock less than the max stock then we can see to buy
        // that stock in order to maximize the profit.

        // ****** this is calculated for evry stock prize only from right to left
        // so for each stock prize there are two non - overlappiung intervals , one from
        // left to right(max profit if we sell at that day/ stock price)
        // another from right to left (max profit if we buy at that day and sell in the
        // future)
 
        for (int i = prices.length - 2; i >= 0; i--) {

            if (prices[i] > max_stock)

            {
                max_stock = prices[i];
            }

            max_profit_buy_till_theday[i] = Math.max(max_stock - prices[i], max_profit_buy_till_theday[i + 1]);
        }
        // in order to get put final result we add them , since we can perform two
        // transactions only . one from left-right(buy nad sell), one from
        // right to left(buy and sell)
        int res = 0;
        for (int i = 0; i < prices.length; i++) {

            res = Math.max(max_profit_sell_till_theday[i] + max_profit_buy_till_theday[i], res);
        }
        return res;
    }
}
