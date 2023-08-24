class Solution {
    public int bruteForce(int[] nums) {
        int mxC = 0, mnC = 0;
        for (int i : nums) {
            if (i == 0) {
                continue;
            }
            if (i < 0) {
                mnC++;
            } else {
                mxC++;
            }
        }
        return Math.max(mxC, mnC); 
    }

    public int getUpperBound(int[] nums) {
        int idx = -1;
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == 0) {
                idx = mid;
                lo = mid + 1;
            } else if (nums[mid] > 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return idx;
    }

    public int getLowerBound(int[] nums) {
        int idx = -1;
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == 0) {
                idx = mid;
                hi = mid - 1;
            } else if (nums[mid] > 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return idx;  
    }

    public int maximumCount(int[] nums) {
        int lb = getLowerBound(nums), ub = getUpperBound(nums);
        if (lb == -1 && ub == -1 && nums[0] < 0 && nums[nums.length-1] > 0) {
            return bruteForce(nums);
        }
        return Math.max(lb, nums.length-(ub+1));
    }
}
