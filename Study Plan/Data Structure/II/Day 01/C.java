class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            while (j < k) {
                if (k<nums.length-1 && nums[k]==nums[k+1]) {
                    k--;
                    continue;
                }
                if (nums[i]+nums[j]+nums[k] > 0) {
                    k--;
                } else if (nums[i]+nums[j]+nums[k] < 0) {
                    j++;
                } else {
                    ArrayList<Integer> threeSum = new ArrayList<>();
                    threeSum.add(nums[i]); threeSum.add(nums[j]); threeSum.add(nums[k]);
                    result.add(threeSum);
                    j++; k--;
                }
            }
        }
        return result;
    }
}
