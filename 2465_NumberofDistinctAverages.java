// 1 ms
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Double> set = new HashSet<>();
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            set.add((double)(nums[lo++] + nums[hi--]) / 2);
        }
        return set.size();
    }
}

// 0 ms
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int[] avgs = new int[201];
        for (int i=0, j=nums.length-1; i<nums.length && j>=0; i++, j--) {
            avgs[nums[i] + nums[j]]++;
        }
        int c = 0;
        for (int avg : avgs) {
            if (avg != 0) {
                c++;
            }
        }
        return c;
    }
}
