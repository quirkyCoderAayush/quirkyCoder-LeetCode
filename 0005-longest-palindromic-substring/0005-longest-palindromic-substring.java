class Solution {
    int start=0, end=0;
    int maxLen=0;
    public boolean checkPalindrome(String s, int i, int j) {
        while(i<j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        if(s==null || n<2) return s;

        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(checkPalindrome(s,i,j)) {
                    if((j-i+1) > maxLen) {
                        maxLen = j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start, end+1);
    }
}