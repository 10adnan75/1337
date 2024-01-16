class Solution {
    public int[] createPerm(int n) {
        int[] perm = new int[n+1];
        for (int i=0; i<n; i++) {
            perm[i] = i+1;
        }
        perm[n] = n;
        return perm;
    }

    public boolean check(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i=0; i<a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int n: nums) {
            max = Math.max(max, n);
        }
        return check(nums, createPerm(max));
    }
}
