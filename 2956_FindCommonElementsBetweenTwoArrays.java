class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n1 = 0, n2 = 0;
        for (int n: nums1) {
            if (find(nums2, n)) {
                n1++;
            }
        }
        for (int n: nums2) {
            if (find(nums1, n)) {
                n2++;
            }
        }
        return new int[] {n1, n2};
    }

    public boolean find(int[] a, int x) {
        for (int i: a) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }
}
