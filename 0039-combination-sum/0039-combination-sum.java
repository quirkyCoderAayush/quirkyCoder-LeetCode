class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int n = candidates.length; int start=0;

        helper(candidates, start, target, current, result);
        return result;
    }
    public void helper(int[] candidates, int start, int target, List<Integer> current, List<List<Integer>> result) {
        if(start==candidates.length) {
            if(target==0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        if(candidates[start]<= target) {
            current.add(candidates[start]);
            helper(candidates, start, target-candidates[start], current, result);
            current.remove(current.size()-1);
        }
        helper(candidates, start+1, target, current, result);
    }
}