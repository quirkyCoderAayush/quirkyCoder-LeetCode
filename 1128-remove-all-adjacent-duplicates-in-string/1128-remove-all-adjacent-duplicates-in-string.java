class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        
        for (int end = 0; end < arr.length; end++) {
            if (start > 0 && arr[start - 1] == arr[end]) {
                start--;
            } else {
                arr[start] = arr[end];
                start++;
            }
        }
        return new String(arr, 0, start);
    }
}