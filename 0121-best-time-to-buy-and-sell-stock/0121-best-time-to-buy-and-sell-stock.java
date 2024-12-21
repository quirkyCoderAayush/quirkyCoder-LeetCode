class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int totalProfit = 0;
       
        for(int i=0; i<n; i++) {
            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i] - minPrice;

            totalProfit = Math.max(totalProfit, profit);
        }
        return totalProfit;
    }
}