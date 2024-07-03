class Solution {
    public void sortColors(int[] nums) {
        int i = 0, lo = 0, hi = nums.length-1;
        while (i <= hi) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 0) {
                nums[i++] =  nums[lo];
                nums[lo++] = 0;
            } else {
                nums[i] = nums[hi];
                nums[hi--] = 2;
            }
        }
    }
}

// My code
class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for (int color: nums) {
            freq[color]++;
        }
        int id = 0;
        for (int i=0; i<3; i++) {
            while (freq[i]-- > 0) {
                nums[id++] = i;
            }
        }
    }
}
