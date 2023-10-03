class Solution {
    public int[] perm;

    public int process(int x) {
        int i = 0;
        for (i=0; i<perm.length; i++) {
            if (perm[i] == x) {
                int j = i;
                while (j > 0) {
                    perm[j] = perm[j-1];
                    j--;
                }
                perm[j] = x;
                break;
            }
        }
        return i;
    }

    public int[] processQueries(int[] queries, int m) {
        perm = new int[m];
        int[] ans = new int[queries.length];
        for (int i=0; i<m; i++) {
            perm[i] = i+1;
        }
        for (int i=0; i<queries.length; i++) {
            ans[i] = process(queries[i]);
        }
        return ans;
    }
}
