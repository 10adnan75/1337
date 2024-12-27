class Solution {    
    public void moveZeroes(int[] nums) {
        int lo = 0, hi = 0;
        while (hi < nums.length) {
            if (nums[hi] != 0) {
                nums[lo++] = nums[hi];
            }
            hi++;
        }
        while (lo < nums.length) {
            nums[lo++] = 0;
        }
    }
}

// My code: auxiliary-space
class Solution {
    public void moveZeroes(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0, idx=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                ans[idx++] = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}

// My code: in-place
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZero++]= nums[i];
            }
        }
        for (int i=nonZero; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}

// I solved this problem using another approach while in USA while listening to "Abhi na jao chodkar" by the legendary Mohammad Rafi :)
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, n = nums.length;

        while (i < n && nums[i] != 0) {
            i++;
            j++;
        }

        while (i < n) {
            if (nums[i] != 0) {
                while (j < n && nums[j] != 0) {
                    j++;
                }

                if (j < n ) {
                    swap(nums, i, j);
                }
            }
            i++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
