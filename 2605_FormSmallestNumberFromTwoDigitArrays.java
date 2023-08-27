class Solution {
    public boolean search(int[] a, int x) {
        for (int i : a) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }

    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i=0; i<nums1.length; i++) {
            if (search(nums2, nums1[i])) {
                return nums1[i];
            }
        }
        return nums2[0] > nums1[0] ? Integer.parseInt(nums1[0]+""+nums2[0]) : Integer.parseInt(nums2[0]+""+nums1[0]);
    }
}
