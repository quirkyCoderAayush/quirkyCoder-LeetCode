class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int start = 0, end = 0, count = 0;

        while (start < g.length && end < s.length) {
            if (g[start] <= s[end]) { 
                count++;
                start++; 
            }
            end++; 
        }
        return count;
    }
}