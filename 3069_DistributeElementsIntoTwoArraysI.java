class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for (int i=2; i<nums.length; i++) {
            if (l1.get(l1.size()-1) < l2.get(l2.size()-1)) {
                l2.add(nums[i]);
            } else {
                l1.add(nums[i]);
            }
        }
        int idx = 0;
        for (int i: l1) {
            nums[idx++] = i;
        }
        for (int i: l2) {
            nums[idx++] = i;
        }
        return nums;
    }
}
