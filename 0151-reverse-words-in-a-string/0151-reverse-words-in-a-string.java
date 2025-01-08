class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        reverse(chars, 0, n - 1);

        int start = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == ' ') {
                reverse(chars, start, i - 1);
                start = i + 1;
            } else if (i == n - 1) {
                reverse(chars, start, i);
            }
        }

        return cleanSpaces(chars, n);
    }
    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
    private String cleanSpaces(char[] chars, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && chars[j] == ' ') j++;
            while (j < n && chars[j] != ' ') chars[i++] = chars[j++];
            while (j < n && chars[j] == ' ') j++;
            if (j < n) chars[i++] = ' ';
        }
        return new String(chars, 0, i);
    }
}