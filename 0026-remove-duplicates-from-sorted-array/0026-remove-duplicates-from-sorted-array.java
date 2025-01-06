class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;

        if(n==0 || nums==null) return 0;

        int i=1;
        for(int j=1; j<n; j++) {
            if(nums[j] != nums[j-1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}