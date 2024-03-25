class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[Math.abs(nums[i])-1] < 0) {
                ans.add(Math.abs(nums[i]));
                continue;
            }
            nums[Math.abs(nums[i])-1] *= -1;
        }
        return ans;
    }
}

// Hash Table
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) {
                ans.add(num);
            }
            map.put(num, true);
        }
        return ans;
    }
}
