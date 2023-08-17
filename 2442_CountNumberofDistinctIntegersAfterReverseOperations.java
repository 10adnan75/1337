// Map + Array ~ consumes O(2n) space 
class Solution {
    public int getReverse(int num) {
        return Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

    public int countDistinctIntegers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] reverse = new int[nums.length * 2];
        for (int i=0; i<reverse.length; i++) {
            reverse[i] = i >= nums.length ? getReverse(nums[i - nums.length]) : nums[i];
        }
        for (int num : reverse) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.size();
    }
}

// Map (space-efficient)
class Solution {
    public int getReverse(int num) {
        return Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

    public int countDistinctIntegers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int r = getReverse(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        return map.size();
    }
}

// Set
class Solution {
    public int getReverse(int num) {
        return Integer.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(getReverse(num));
        }
        return set.size();
    }
}
