class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> uniqueElements = new HashSet<>();

        for (int num: nums) uniqueElements.add(num);

        List<Integer> elementsList = new ArrayList<>(uniqueElements);
        Collections.sort(elementsList);

        for (int i = 0; i < elementsList.size(); i++) {
            nums[i] = elementsList.get(i);
        }

        return elementsList.size();
    }
}