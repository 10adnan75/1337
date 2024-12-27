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
