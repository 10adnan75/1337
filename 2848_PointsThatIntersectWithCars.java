class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] freq = new boolean[101];
        for (List<Integer> num: nums) {
            for (int i=num.get(0); i<=num.get(num.size()-1); i++) {
                freq[i] = true;
            }
        }
        int c = 0;
        for (int i=1; i<freq.length; i++) {
            if (freq[i]) {
                c++;
            }
        }
        return c;
    }
}
