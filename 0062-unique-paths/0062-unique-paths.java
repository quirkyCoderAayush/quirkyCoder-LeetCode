class Solution {
    public int uniquePaths(int m, int n) {
        int smaller = Math.min(m - 1, n - 1);
        int totalSteps = m + n - 2;

        long result = 1;
        for(int i=1; i<=smaller; i++) {
            result = (result*(totalSteps-i+1))/i;
        }
        return (int) result;
    }
}