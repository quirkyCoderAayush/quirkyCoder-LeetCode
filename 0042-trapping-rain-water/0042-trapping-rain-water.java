class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (height == null || n == 0 || n==1) return 0;

        int left = 0, right = n - 1;
        int left_max = 0, right_max = 0;
        int water_trapped = 0;

        while(left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    water_trapped += left_max - height[left];
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    water_trapped += right_max - height[right];
                }
                right--;
            }
        }
        return water_trapped;
    }
}