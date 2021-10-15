class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length, n = nums2.length;
        int lo = 0, hi = m;
        while (lo <= hi) {
            int partitionN1 = (lo + hi) / 2;
            int partitionN2 = (m + n + 1) / 2 - partitionN1;
            int leftMaxN1 = partitionN1 == 0 ? Integer.MIN_VALUE : nums1[partitionN1-1];
            int leftMaxN2 = partitionN2 == 0 ? Integer.MIN_VALUE : nums2[partitionN2-1];
            int rightMinN1 = partitionN1 == m ? Integer.MAX_VALUE : nums1[partitionN1];
            int rightMinN2 = partitionN2 == n ? Integer.MAX_VALUE : nums2[partitionN2];
            if (leftMaxN1<=rightMinN2 && leftMaxN2<=rightMinN1) {
                if ((m+n)%2 == 0) {
                    return (Math.max(leftMaxN1, leftMaxN2) + Math.min(rightMinN1, rightMinN2)) / 2.0;
                } else {
                    return Math.max(leftMaxN1, leftMaxN2);
                }
            } else if (leftMaxN1 > rightMinN2) {
                hi = partitionN1 - 1;
            } else {
                lo = partitionN1 + 1;
            }
        }
        throw new IllegalArgumentException();
    }
}
