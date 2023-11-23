class Solution {
    public int[] makeArray(int[] n, int start, int end) {
        int[] arr = new int[end-start];
        int idx = 0;
        for (int i=start; i<end; i++) {
            arr[idx++] = n[i];
        }
        return arr;
    }

    public boolean check(int[] n, int lo, int hi) {
        int[] arr = makeArray(n, lo, hi);
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for (int i=2; i<arr.length; i++) {
            if (arr[i] - arr[i-1] != d) {
                return false;
            }
        }
        return true;
    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for (int i=0; i<r.length; i++) {
            ans.add(check(nums, l[i], r[i]+1));
        }
        return ans;
    }
}
