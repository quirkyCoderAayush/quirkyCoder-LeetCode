class Solution {
    public int subarraySum(int[] nums, int k) {
        //  [15, -2, 2, -8, 1, 7, 10, 23]
        int n = nums.length;
        int count = 0;
        int currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num: nums) {
            currSum += num;
            if(map.containsKey(currSum-k)) {
                count += map.get(currSum-k);
            }
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}