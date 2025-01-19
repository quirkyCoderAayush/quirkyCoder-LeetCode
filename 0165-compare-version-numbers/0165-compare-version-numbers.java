class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        // ver1 = ["1", "2"]
        // ver2 = ["1", "10"]

        int n = Math.max(ver1.length, ver2.length);

        for(int i=0; i<n; i++) {
            int rev1, rev2;

            if (i < ver1.length) {
                rev1 = Integer.parseInt(ver1[i]);
            } else {
                rev1 = 0;
            }

            if (i < ver2.length) {
                rev2 = Integer.parseInt(ver2[i]);
            } else {
                rev2 = 0;
            }

            if (rev1 > rev2) {
                return 1;
            } else if (rev1 < rev2) {
                return -1;
            }
        }
        return 0;
    }
}