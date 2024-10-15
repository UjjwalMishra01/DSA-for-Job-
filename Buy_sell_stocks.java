package src;

public class Buy_sell_stocks {
    int profit=0;
    public int maxProfit(int[] prices) {
        int profit=0;
        boolean hold = false;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                profit+=prices[i+1]-prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        Buy_sell_stocks bsf = new Buy_sell_stocks();
        int[] prices = {7,1,5,3,6,4};
       System.out.println( bsf.maxProfit(prices));
    }
}
