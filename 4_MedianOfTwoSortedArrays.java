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

// Brute force
// FEB 26, 2025, 8:10 PM, USA
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int n = l1 + l2;
        int id = 0;
        int[] arr = new int[n];

        for (int i=0; i<l1; i++) {
            arr[id++] = nums1[i];
        }

        for (int i=0; i<l2; i++) {
            arr[id++] = nums2[i];
        }

        Arrays.sort(arr);

        int mid = n / 2;
        if (n % 2 == 0) {
            return (arr[mid] + arr[mid-1]) / 2.0;
        }
        return arr[mid] / 1.0;
    }
}
