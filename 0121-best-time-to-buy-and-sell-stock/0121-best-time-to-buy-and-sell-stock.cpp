class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int todaysProfit=0, totalProfit=0, buyDay=0;
        int n=prices.size()-1;

        for(int i=1; i<=n; i++) {
            todaysProfit = prices[i] - prices[buyDay];
            if(todaysProfit<=0) {
                buyDay=i;
            }
            if(todaysProfit > totalProfit) {
                totalProfit = todaysProfit;
            }
        }
        return totalProfit;
    }
};