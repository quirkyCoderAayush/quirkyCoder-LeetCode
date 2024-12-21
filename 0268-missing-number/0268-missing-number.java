class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int index = 0;
        while(index < n) {
            if(nums[index] != index) return index;
            index++;
        }
        return index;
    }
}