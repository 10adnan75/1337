class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1;
        int N = nums.length;
        int[] left = new int[N];
        int[] right = new int[N];
        for (int i=1, j=N-2; i<N && j>=0; i++, j--) {
            left[i] = left[i-1] + nums[i-1];
            right[j] = right[j+1] + nums[j+1];
        }
        for (int idx=0; idx<N; idx++) {
            if (left[idx] == right[idx]) {
                pivot = idx;
                break;
            }
        }
        return pivot;
    }
}
