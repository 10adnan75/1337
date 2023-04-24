class Solution {
    public void shiftElements(int[] arr, int index) {
        int n = arr.length - 1;
        for (int i=n-1; i>=index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = 0;
    }
    
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == 0) {
                shiftElements(arr, i+1);
                i++;
            }
            i++;
        }
    }
}
