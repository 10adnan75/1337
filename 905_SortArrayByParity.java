// My solution, wrong answer :(
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        int mid = lo + (hi - lo) / 2;
        while (lo <= mid) {
            if ((nums[lo] & 1) == 1) {
                while (hi >= mid && (nums[hi] & 1) == 1) {
                    hi--;
                }
                if (hi >= mid) {
                    int temp = nums[hi];
                    nums[hi] = nums[lo];
                    nums[lo] = temp;
                }
            }
            lo++;
        }
        return nums;
    }
}

// One pass, O(n) 
// Runtime: 1 ms, beats 99.23%
// Memory: 44.2 MB, beats 47.68%
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0, lo=0, hi=nums.length-1; i<nums.length; i++) {
            if ((nums[i] & 1) == 1) {
                ans[hi--] = nums[i];
            } else {
                ans[lo++] = nums[i];
            }
        }
        return ans;
    }
}

// In-place, O(n)
// Runtime: 1 ms, beats 99.23%
// Memory: 44.1 MB, beats 47.68%
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            if ((nums[lo] & 1) > (nums[hi] & 1)) {
                int temp = nums[lo];
                nums[lo] = nums[hi];
                nums[hi] = temp;
            }
            if ((nums[lo] & 1) == 0) {
                lo++;
            }
            if ((nums[hi] & 1) == 1) {
                hi--;
            }
        }
        return nums;
    }
}

// Fastest
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for (int i=0, prev=0; i<nums.length; i++) {
            if ((nums[i] & 1) == 0) {
                int temp = nums[prev];
                nums[prev++] = nums[i];
                nums[i] = temp; 
            }
        }
        return nums;
    }
}
