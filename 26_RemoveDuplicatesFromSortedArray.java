class Solution {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[currentIndex] != nums[i]) {
                currentIndex++;
                nums[currentIndex] = nums[i];
            }
        }
        return currentIndex+1;
    }
}
