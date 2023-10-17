class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] aux = new int[n];
        for (int i=0; i<n; i++) {
            aux[i] = score[i];
        }
        Arrays.sort(aux);
        String[] ans = new String[n];
        Map<Integer, String> map = new HashMap<>();
        int idx = 4;
        for (int i=n-1; i>=0; i--) {
            if (i == n-1) {
                map.put(aux[n-1], "Gold Medal");
            } else if (i == n-2) {
                map.put(aux[n-2], "Silver Medal");
            } else if (i == n-3) {
                map.put(aux[n-3], "Bronze Medal");
            } else {
                map.put(aux[i], (idx++)+"");
            }
        }
        for (int i=0; i<n; i++) {
            ans[i] = map.get(score[i]);
        }
        return ans;
    }
}
