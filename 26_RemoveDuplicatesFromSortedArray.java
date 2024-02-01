class Solution {
    public int removeDuplicates(int[] nums) {
        int currentIndex = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[currentIndex] == nums[i]) continue;
            nums[++currentIndex] = nums[i]
        }
        return currentIndex+1;
    }
}

// my code
class Solution {
    public int removeDuplicates(int[] nums) {
        int[] freq = new int[201];
        for (int num: nums) {
            freq[num+100]++;
        }
        int j = 0;
        for (int i=0; i<freq.length; i++) {
            if (freq[i] != 0) {
                nums[j++] = i-100;
            }
        }
        return j;
    }
}
