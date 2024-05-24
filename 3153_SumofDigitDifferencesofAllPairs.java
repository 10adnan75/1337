// Brute force: TLE :(
class Solution {
    public long sumDigitDifferences(int[] nums) {
        long sum = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                sum += getSum(nums[i]+"", nums[j]+"");
            }
        }
        return sum;
    }

    public long getSum(String x, String y) {
        long c = 0;
        for (int i=0; i<x.length(); i++) {
            if (x.charAt(i) != y.charAt(i)) {
                c++;
            }
        }
        return c;
    }
}
