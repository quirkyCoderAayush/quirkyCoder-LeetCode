class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new TreeMap<>();
        for(int num: nums) map.put(num, map.getOrDefault(num,0)+1);

        int pos = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int num = entry.getKey();
            int cnt = entry.getValue();

            for(int i=0; i<cnt; i++) {
                nums[pos++] = num;
            }
        }
    }
}