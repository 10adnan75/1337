class Solution {
    public int findIndex(int n, int[] a) {
        for (int i=0; i<a.length; i++) {
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public int findGreatest(int n, int start, int[] a) {
        for (int i=start+1; i<a.length; i++) {
            if (a[i] > n) {
                return a[i];
            }
        }
        return -1;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int i = 0;
        for (int num : nums1) {
            ans[i++] = findGreatest(num, findIndex(num, nums2), nums2);
        }
        return ans;
    }
}
