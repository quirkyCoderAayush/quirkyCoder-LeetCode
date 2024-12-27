class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;   //  [-2, -1, 0, 0, 1, 2]
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Second loop for the second number
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Two-pointer technique for the last two numbers
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(
                            nums[i], nums[j], nums[left], nums[right]));
                        while (left<right && nums[left]==nums[left+1]) left++;
                        while (left<right&&nums[right]==nums[right-1])right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}