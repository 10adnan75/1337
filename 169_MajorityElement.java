class Solution {
    public int majorityElement(int[] nums) {
        
        // HashTable - Runtime: 10 ms, Memory: 54.4 MB
        /* HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
            if (map.get(i) > nums.length/2) {
                return i;
            }
        }
        return -1; */
        
        // BoyerMoore Voting Algorithm - Runtime: 2 ms, Memory: 44.4 MB
        int candidate = -1, count = 0;
        for (int i=0; i<nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            count += (candidate == nums[i]) ? 1 : -1;
        }
        return candidate;
    }
}

// My code
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for (Map.Entry e: map.entrySet()) {
            if ((int) e.getValue() > nums.length/2) {
                return (int) e.getKey();
            }
        }
        return -1;
    }
}
