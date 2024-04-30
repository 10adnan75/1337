// 2 ms
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0]; 
    }
}

// 0 ms
class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        return getMin(nums2) - getMin(nums1); 
    }

    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
