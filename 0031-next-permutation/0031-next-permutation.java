class Solution {
    public void nextPermutation(int[] nums) {
        // nums = [1, 5, 4, 3, 2]   2 3 1 4 
        int n = nums.length;
        int i=n-2;
        for(; i>=0; i--) {
            if(nums[i]<nums[i+1]) break;
        }
        if(i==-1) {
            reverse(nums, 0, n-1);
        }

        if(i>=0) {
            int j=n-1;
            while(nums[j]<=nums[i]) {
                j--;
            }
            swap(nums, i, j);
            reverse(nums, i+1, n-1);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int i, int j) {
        int left=i, right=j;
        while(left<=right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}