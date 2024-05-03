class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\."), v2 = version2.split("\\.");
        if (v1.length < v2.length) {
            return compare1(v1, v2);
        }
        return compare2(v1, v2);
    }

    public int compare1(String[] v1, String[] v2) {
        for (int i=0; i<v1.length; i++) {
            int one = Integer.valueOf(v1[i]), two = Integer.valueOf(v2[i]);
            if (one < two) {
                return -1;
            }
            if (two < one) {
                return 1;
            }
        }
        for (int i=v1.length; i<v2.length; i++) {
            if (Integer.valueOf(v2[i]) > 0) {
                return -1;
            }
        }
        return 0;
    }

    public int compare2(String[] v1, String[] v2) {
        for (int i=0; i<v2.length; i++) {
            int one = Integer.valueOf(v1[i]), two = Integer.valueOf(v2[i]);
            if (one < two) {
                return -1;
            }
            if (two < one) {
                return 1;
            }
        }
        for (int i=v2.length; i<v1.length; i++) {
            if (Integer.valueOf(v1[i]) > 0) {
                return 1;
            }
        }
        return 0;
    }
}
