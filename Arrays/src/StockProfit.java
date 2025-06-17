public class StockProfit {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4,10};
        System.out.println(maxProfit(prices));

    }
    static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit = 0;
        for(int i =0; i<prices.length; i++){
            int cost = prices[i]- min;
            maxprofit = Math.max(maxprofit, cost);
            min =Math.min(min , prices[i]);
        }
        return maxprofit;

    }

}
