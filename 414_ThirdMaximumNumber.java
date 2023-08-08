class Solution {
    public int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    public int thirdMax(int[] nums) {
        boolean found = false;
        int max = getMax(nums), sMax = Integer.MIN_VALUE, tMax = Integer.MIN_VALUE;
        if (nums.length < 3) {
            return max;
        }
        for (int n : nums) {
            if (n >= sMax && n != max) {
                sMax = n;
            }
        }
        for (int n : nums) {
            if (n >= tMax && n != max && n != sMax) {
                tMax = n;
                found = true;
            }
        }
        return found == true ? tMax : max;
    }
}
