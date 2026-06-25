class Solution {
    public int maxProfit(int[] prices) {
        int[] profits = new int[prices.length];
        for(int i=1;i<prices.length;i++){
            profits[i-1]=prices[i]-prices[i-1];
        }
        int profit=0;
        int max_profit=0;
        for(int i=0;i<profits.length;i++){
            profit+=profits[i];
            max_profit=profit>max_profit?profit:max_profit;
            profit=profit<0?0:profit;
        }
        return max_profit;
    }
}