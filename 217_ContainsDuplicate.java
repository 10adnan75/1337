class Solution {
    public boolean containsDuplicate(int[] nums) {
    
        // O(nlgn) - Runtime: 3 ms, Memory Usage: 42.1 MB
        /* Arrays.sort(nums);
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false; */
        
        // O(n) - Runtime: 0 ms, Memory Usage: 42.7 MB
        if (nums.length == 0) {
            return false;
        }
        HashSet<Integer> mySet = new HashSet<>();
        for (int i : nums) {
            if (!mySet.add(i)) {
                return true;
            }
        }
        return false;
    }
}
