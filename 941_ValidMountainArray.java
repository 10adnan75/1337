class Solution {
    public int getPivot(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            if (a[i+1] < a[i]) {
                return i;
            } else if (a[i+1] == a[i]) {
                break;
            }
        }
        return -1;
    }

    public boolean validMountainArray(int[] arr) {
        if (arr.length >= 3) {
            int pivot = getPivot(arr);
            if (pivot == -1 || pivot == 0) {
                return false;
            }
            for (int i=pivot+1; i<arr.length-1; i++) {
                if (arr[i] <= arr[i+1]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
