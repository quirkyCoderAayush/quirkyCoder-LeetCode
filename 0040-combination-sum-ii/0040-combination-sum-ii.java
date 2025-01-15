class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int start=0;
        Arrays.sort(candidates);

        helper(candidates, start, target, current, result);
        return result;
    }
    public void helper(int[] candidates, int start, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=start; i<candidates.length; i++) {
            if(i>start && candidates[i] == candidates[i-1]) continue;

            if(candidates[i] > target) break;

            current.add(candidates[i]);

            helper(candidates, i + 1, target - candidates[i], current, result);

            current.remove(current.size() - 1);
        }
    }
}