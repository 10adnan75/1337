class Solution {
    public int unequalTriplets(int[] nums) {
        int c = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] != nums[j]) {
                    for (int k=j+1; k<nums.length; k++) {
                        if (nums[j] != nums[k] && nums[k] != nums[i]) {
                            c++;
                        }
                    }
                }
            }
        }
        return c;
    }
}
