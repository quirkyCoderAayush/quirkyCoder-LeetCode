class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;

        if(n==0 || nums==null) return 0;

        Set<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);

        List<Integer> elements = new ArrayList<>(set);
        Collections.sort(elements);

        for(int i=0; i<elements.size(); i++) {
            nums[i] = elements.get(i);
        }
        return elements.size();
    }
}