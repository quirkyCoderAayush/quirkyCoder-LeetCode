class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int n = nums.length;
        int sum = 0;

        for(int num: nums) sum += num;

        if((sum+target)%2 != 0 || sum < Math.abs(target)) return 0;

        int s = (sum+target)/2;

        int[][] dp = new int[n+1][s+1];

        for(int i=0; i<=n; i++) {
            dp[i][0] = 1;
        }
        for(int j=1; j<=s; j++) {
            dp[0][j] = 0;
        }

        for(int i=1; i<=n; i++) {
            for(int j=0; j<=s; j++) {
                if(nums[i-1] <= j) {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][s];
    }
}