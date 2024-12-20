class Solution {
    public int maxSubArray(int[] nums) {

        int n=nums.length;
        int currMax = 0;
        int totalSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            currMax += nums[i];
            totalSum = Math.max(totalSum, currMax);
            
            if(currMax<0) currMax=0;
        }
        return totalSum;
    }
}