class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Integer> mpp = new HashMap<>();

        for (char ch : s.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        for(char ch: t.toCharArray()) {
            if(!mpp.containsKey(ch) || mpp.get(ch)==0) {
                return false;
            }
            else {
                mpp.put(ch, mpp.get(ch)-1);
            }
        }
        
        for (int count : mpp.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;


    }
}