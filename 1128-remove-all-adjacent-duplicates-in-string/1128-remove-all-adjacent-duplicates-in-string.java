class Solution {
    public String removeDuplicates(String s) {
        char[] words = s.toCharArray();

        int start=0, n=words.length;
        for(int i=0; i<n; i++) {
            if(start>0 && words[start-1] == words[i]) {
                start--;
            }
            else {
                words[start]=words[i];
                start++;
            }
        }
        return new String(words, 0, start);
    }
}