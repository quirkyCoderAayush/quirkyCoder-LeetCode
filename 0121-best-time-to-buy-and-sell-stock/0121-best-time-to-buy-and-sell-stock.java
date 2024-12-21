class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int currProfit = 0;
        int totalProfit = Integer.MIN_VALUE;
        int idx=0;
        for(int i=1; i<n; i++) {
            currProfit = prices[i] - prices[idx];
            totalProfit = Math.max(totalProfit, currProfit);

            if(currProfit < 0) {
                currProfit = 0;
                idx=i;
            }
        }
        if(totalProfit<0) totalProfit=0;
        return totalProfit;
    }
}