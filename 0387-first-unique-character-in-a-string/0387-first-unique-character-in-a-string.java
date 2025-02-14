class Solution {
    public int firstUniqChar(String s) {

        Set<Character> uniq = new HashSet<>();
        List<Character> elements = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            elements.add(s.charAt(i));
        }

        for(int i=0; i<elements.size(); i++) {
            char ch = elements.get(i);
            if(!uniq.contains(elements.get(i))) {
                if (elements.indexOf(ch) == elements.lastIndexOf(ch)) {
                    return i;
                } else {
                    uniq.add(ch);
                }
            }
        }
        return -1;
    }
}