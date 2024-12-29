class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
        Map<Character, Integer> elements = new HashMap<>();
        int count = 0, left = 0;

        for(int right=0; right<s.length(); right++) {

            if(elements.containsKey(s.charAt(right))) {
                left = Math.max(left, elements.get(s.charAt(right))+1);
            }
            elements.put(s.charAt(right), right);
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}