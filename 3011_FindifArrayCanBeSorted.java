class Solution {
    public boolean canSortArray(int[] nums) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        for (int i=0; i<nums.length; i++) {
            for (int j=0; j<nums.length-i-1; j++) {
                int a = numsCopy[j], b = numsCopy[j+1];
                if (a > b) {
                    if (Integer.bitCount(a) == Integer.bitCount(b)) {
                        numsCopy[j] = b;
                        numsCopy[j+1] = a;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
