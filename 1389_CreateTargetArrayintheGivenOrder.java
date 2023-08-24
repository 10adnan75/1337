// 
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

// Runtime: 0 ms, Beats 100%
// Memory: 40.51 MB, Beats 96.89%
class Solution {
    public int[] target;

    public void updateArray(int index, int val) {
        int i = target.length - 1;
        while (i > index) {
            target[i] = target[--i];
        }
        target[index] = val;
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        target = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            updateArray(index[i], nums[i]);
        }
        return target;
    }
}
