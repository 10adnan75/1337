class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int n: nums1) {
            set1.add(n);
        }
        for (int n: nums2) {
            if (set1.contains(n) && !ans.contains(n)) {
                ans.add(n);
            }
            set2.add(n);
        }
        for (int n: nums3) {
            if ((set1.contains(n) || set2.contains(n)) && !ans.contains(n)) {
                ans.add(n);
            }
        }
        return ans;
    }
}
