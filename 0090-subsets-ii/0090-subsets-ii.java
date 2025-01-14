class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(nums);
        int start=0;

        helper(nums, start, current, result);
        return result;
    }
    public void helper(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for(int i=start; i<nums.length; i++) {
            if(i>start && nums[i]==nums[i-1]) continue;

            current.add(nums[i]);

            helper(nums, i+1, current, result);

            current.remove(current.size()-1);
        }
    }
}