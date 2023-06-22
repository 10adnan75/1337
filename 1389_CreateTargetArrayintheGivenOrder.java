class Solution {
    public void putAtIndex(int[] arr, int pos, int val) {
        for (int i=arr.length-1; i>pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = val;
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            putAtIndex(target, index[i], nums[i]);
        }
        return target;
    }
}
