class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> elements = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int count = elements.getOrDefault(nums[i], 0);
            elements.put(nums[i], count+1);
        }

        for(Map.Entry<Integer, Integer> mp: elements.entrySet()) {
            if(mp.getValue() > n/3) {
                result.add(mp.getKey());
            }
        }
        return result;
    }
}