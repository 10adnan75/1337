// Hash Map
class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1 + map.getOrDefault(num, 0));
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((int)entry.getValue() & 1) == 1) {
                return false;
            }
        }
        return true;
    }
}

// Bit Manipulation
class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for (int num : nums) {
            freq[num]++;
        }
        for (int num : freq) {
            if ((num & 1) == 1) {
                return false;
            }
        }
        return true;
    }
}
