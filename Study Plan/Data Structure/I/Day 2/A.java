// Brute force approach - Runtime: 9 ms, Memory: 38.6 MB

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (target == nums[i]+nums[j]) {
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }
}
*/

// Hash Map approach - Runtime: 2 ms, Memory: 42.2 MB

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            } else {
                map.put(target-nums[i], i);
            }
        }
        return new int[2];
    }
}
