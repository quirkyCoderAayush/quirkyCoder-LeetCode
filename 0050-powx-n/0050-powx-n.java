class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        if(n==1) return x;

        if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
                return myPow(x, n) * x;
            }
            n = -n;
        }

        double half = myPow(x, n/2);
        if(n%2==0) {
            return half*half;
        }
        return half*half*x;
    }
}