class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxOnes = 0, count = 0, n = nums.length;

        for(int num: nums) {
            if(num==1) {
                count++;
                maxOnes = Math.max(maxOnes, count);
            }
            else count=0;
        }
        return maxOnes;
    }
}