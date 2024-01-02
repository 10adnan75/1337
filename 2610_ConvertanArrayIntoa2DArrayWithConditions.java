class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] freq = new int[201];
        for (int n: nums) {
            freq[n]++;
        }
        int max = 0;
        for (int i: freq) {
            max = Math.max(max, i);
        }
        while (max-- > 0) {
            List<Integer> l = new ArrayList<>();
            for (int i=1; i<freq.length; i++) {
                if (freq[i] != 0) {
                    l.add(i);
                    freq[i]--;
                }
            }
            ans.add(l);
        }
        return ans;
    }
}
