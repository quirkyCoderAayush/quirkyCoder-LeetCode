class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = 0, count = 0, n = nums.length;

        for(int i=0; i<n; i++) {
            if(nums[i] == 1) {
                count++;
                maxOnes = Math.max(maxOnes, count);
            }
            else {
                count=0;
                continue;
            }
        }
        return maxOnes;
    }
}