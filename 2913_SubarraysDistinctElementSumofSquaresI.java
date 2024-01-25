class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        Set<Integer> s = new HashSet<>();
        for (int i=0; i<nums.size(); i++) {
            for (int j=i; j<nums.size(); j++) {
                s.add(nums.get(j));
                ans += Math.pow(s.size(), 2);
            }
            s.clear();
        }
        return ans;
    }
}
