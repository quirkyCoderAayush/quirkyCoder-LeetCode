class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        int n = nums.length;

        for(int num: nums) {
            if(elements.contains(num)) return num;
            else elements.add(num);
        }
        return 0;
    }
}