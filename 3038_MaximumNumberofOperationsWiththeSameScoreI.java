class Solution {
    public int maxOperations(int[] nums) {
        int maxScore = 1, score = nums[0] + nums[1];
        for (int i=2; i<nums.length-1; i+=2) {
            if (nums[i] + nums[i+1] == score) {
                maxScore++;
            } else {
                return maxScore;
            }
        }
        return maxScore;
    }
}
