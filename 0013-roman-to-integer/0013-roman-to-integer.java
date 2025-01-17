class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
        );

        int n=s.length(), result = 0, prev = 0;

        for (int i=n-1; i>=0; i--) {
            int current = romanMap.get(s.charAt(i));
            result += (current>=prev) ? current : -current;
            prev = current;
        }
        return result;
    }
}