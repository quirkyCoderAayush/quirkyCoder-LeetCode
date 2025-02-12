class Solution {
    public int maximumSum(int[] nums) {
        int maxNum = -1;
        HashMap<Integer, Integer> digitSumMap = new HashMap<>();

        for (int num : nums) {
            int digitSum = calculateDigitSum(num);
            if (digitSumMap.containsKey(digitSum)) {
                maxNum = Math.max(maxNum, digitSumMap.get(digitSum) + num);
            }
            digitSumMap.put(digitSum, Math.max(digitSumMap.getOrDefault(digitSum, 0), num));
        }
        return maxNum;
    }
    private int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}