// Accepted solution, 3 ms
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] freq = new int[10002];
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            freq[i]++;
            max = Math.max(max, i);
        }
        boolean flag = true;
        int[] ans = new int[2];
        for (int i=1; i<=max+1; i++) {
            if (freq[i] == 2) {
                ans[0] = i;
            }
            if (freq[i] == 0 && flag) {
                ans[1] = i;
                flag = false;
            }
        }
        return ans;
    }
}

// Accepted solution, 2 ms
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int[] freq = new int[nums.length+1];
        for (int i : nums) {
            freq[i]++;
        }
        for (int i=1; i<freq.length; i++) {
            if (freq[i] == 0) {
                ans[1] = i;
            }
            if (freq[i] == 2) {
                ans[0] = i;
            }
        }
        return ans;
    }
}

// Need to work on this!
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        boolean[] freq = new boolean[nums.length+1];
        freq[0] = true;
        for (int i=0; i<nums.length; i++) {
            if (freq[nums[i]]) {
                ans[0] = nums[i];
                ans[1] = freq[nums[i]-1] ? nums[i] + 1 : nums[i] - 1;
                break;
            }
            freq[nums[i]] = true;
        }
        return ans;
    }
}
