class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> intervals = new ArrayList<>();
        int i = 0;
        while (i < s.length() - 1) {
            int j = i + 1;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }
            j--;
            if (j - i >= 2) {
                List<Integer> interval = new ArrayList<>();
                interval.add(i);
                interval.add(j);
                intervals.add(interval);
                i = j;
            }
            i++;
        }
        return intervals;
    }
}
