class Solution {
    public long calculateScore(String s) {
        int n = s.length();
        long score = 0;

        Map<Character, TreeSet<Integer>> unmarkedIndices = new HashMap<>();

        for (char c = 'a'; c <= 'z'; c++) {
            unmarkedIndices.put(c, new TreeSet<>());
        }

        for (int i = 0; i < n; i++) {
            unmarkedIndices.get(s.charAt(i)).add(i);
        }

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            char mirrorChar = (char) ('z' - (currentChar - 'a'));
            TreeSet<Integer> mirrorSet = unmarkedIndices.get(mirrorChar);

            Integer closestIndex = mirrorSet.floor(i - 1);
            if (closestIndex != null) {
                mirrorSet.remove(closestIndex);
                unmarkedIndices.get(currentChar).remove(i);
                score += (i - closestIndex);
            }
        }
        return score;
    }
}