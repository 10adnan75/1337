class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[nums.length+1];
        for (int n: nums) {
            freq[n]++;
        }
        for (int i=1; i<freq.length; i++) {
            if (freq[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
