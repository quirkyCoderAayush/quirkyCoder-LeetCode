class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n=g.length, m=s.length;

        int start = 0, end = 0, count = 0;

        while (start < n && end < m) {
            if (g[start] <= s[end]) { 
                count++;
                start++; 
            }
            end++; 
        }
        return count;
    }
}