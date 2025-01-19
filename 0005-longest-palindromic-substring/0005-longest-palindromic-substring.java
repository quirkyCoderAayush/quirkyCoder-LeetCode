class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        
        if(s==null || n<2) return s;

        for(int i=0; i<n; i++) {
            helper(s, i, i);
            helper(s,i, i+1);
        }
        return s.substring(start, start+maxLen);
    }
    int start=0, maxLen=0;
    private void helper(String s, int left, int right) {
        int n = s.length();
        while(left>=0 && right<n && s.charAt(left) == s.charAt(right)) {
            int currLen = right - left + 1;
            if(currLen > maxLen) {
                maxLen = currLen;
                start = left;
            }
            left--;
            right++;
        }
    }
}