// My code
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>(), right = new ArrayList<>();
        int c = 0;
        for (int num : nums) {
            if (num < pivot) {
                left.add(num);
            } else if (num > pivot) {
                right.add(num);
            } else {
                c++;
            }
        }
        int i = 0;
        for (int l: left) {
            nums[i++] = l;
        }
        while (c-- > 0) {
            nums[i++] = pivot;
        }
        for (int r: right) {
            nums[i++] = r;
        }
        return nums;
    }
}

// Optimized
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int idx = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] < pivot) {
                ans[idx++] = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == pivot) {
                ans[idx++] = nums[i];
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > pivot) {
                ans[idx++] = nums[i];
            }
        }
        return ans;
    }
}
