class Solution {
    int start = 0, maxLen = 0;

    public String longestPalindrome(String s) {
        int n = s.length();
        if (s == null || n < 2) return s;

        for (int i = 0; i < n; i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }
        return s.substring(start, start + maxLen);
    }

    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            int currentLen = right - left + 1;
            if (currentLen > maxLen) {
                maxLen = currentLen;
                start = left;
            }
            left--;
            right++;
        }
    }
}