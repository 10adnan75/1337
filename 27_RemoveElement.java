class Solution {
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int c = 0, n = nums.length;
        for (int i=0; i<n; i++) {
            if (nums[i] == val) {
                c++;
            }
        }
        int end = n-1;
        for (int i=0; i<n-c; i++) {
            if (nums[i] == val) {
                while (end >= 0 && nums[end] == val) {
                    end--;
                }
                if (i != end) {
                    swap(nums, i, end);
                }
            }
        }
        return n-c;
    }
}
