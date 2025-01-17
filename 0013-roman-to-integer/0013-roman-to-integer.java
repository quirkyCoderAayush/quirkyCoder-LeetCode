class Solution {
    public int romanToInt(String s) {
        int n=s.length(), result = 0, prev = 0;

        for (int i = n-1; i >= 0; i--) {
            int current = value(s.charAt(i));
            result += (current >= prev) ? current : -current;
            prev = current;
        }
        return result;
    }
    private int value(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}