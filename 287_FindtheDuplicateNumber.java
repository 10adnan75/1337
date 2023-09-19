// 3 ms
class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[100001];
        for (int i : nums) {
            freq[i]++;
        }
        for (int i=0; i<freq.length; i++) {
            if (freq[i] > 1) {
                return i;
            }
        }
        return -1;
    }
}

// 1 ms
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] freq = new boolean[nums.length+1];
        for (int i : nums) {
            if (freq[i]) {
                return i;
            }
            freq[i] = true;
        }
        return -1;
    }
}
