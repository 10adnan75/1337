class Solution {
    public int[] replaceElements(int[] arr) {
        int last = arr.length-1;
        int max = arr[last];
        int[] ans = new int[last+1];
        ans[last] = -1;
        for (int i=arr.length-2; i>=0; i--) {
            max = Math.max(max, arr[i+1]);
            ans[i] = max;
        }
        return ans;
    }
}
