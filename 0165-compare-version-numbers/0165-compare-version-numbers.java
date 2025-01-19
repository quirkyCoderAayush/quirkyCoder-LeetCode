class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int n = Math.max(ver1.length, ver2.length);

        for(int i=0; i<n; i++) {
            int rev1 = i < ver1.length ? Integer.parseInt(ver1[i]) : 0;
            int rev2 = i < ver2.length ? Integer.parseInt(ver2[i]) : 0;

            if(rev1<rev2) return -1;
            if(rev1>rev2) return 1;
        }
        return 0;
    }
}