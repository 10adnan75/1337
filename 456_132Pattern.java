// Brute force: TLE
class Solution {
    public boolean find132pattern(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] < nums[j]) {
                    for (int k=j+1; k<nums.length; k++) {
                        if (nums[j] > nums[k] && nums[i] < nums[k]) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

// Stack: Accepted
