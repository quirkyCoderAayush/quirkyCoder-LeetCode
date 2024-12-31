class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length; int count=1, maxCount=1;
        if(n==0) return 0;
        if(n==1) return 1;
        Arrays.sort(nums);
        //  [1, 2, 3, 4, 100, 200]
        for(int i=1; i<n; i++) {
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]-nums[i-1] == 1) {
                count++;
            }
            maxCount = Math.max(count, maxCount);
            if(nums[i]-nums[i-1] != 1) {
                count=1;
            }
        }
        return maxCount;
    }
}