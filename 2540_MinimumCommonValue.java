// Runtime: 1 ms, Beats 98.90%
// Memory: 55.60 MB, Beats 42.69%
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }
}

// Runtime: 0 ms, Beats 100.00%
// Memory: 55.24 MB, Beats 72.67%
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
      // The slight optimization which efficiently passes the worst-case scenario and some edge cases.
        if (nums1[nums1.length-1] < nums2[0] || nums2[nums2.length-1] < nums1[0]) {
            return -1;
        }
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return -1;
    }
}
