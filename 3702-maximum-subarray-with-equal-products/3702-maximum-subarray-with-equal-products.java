class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            int gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                gcd = gcd(gcd, nums[j]);
                lcm = (lcm / gcd(lcm, nums[j])) * nums[j];
                
                if (prod == lcm * gcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    private int gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return (int) a;
    }
}