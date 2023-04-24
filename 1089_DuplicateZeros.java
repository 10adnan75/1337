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

// Optimized performance
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] auxArr = new int[n];
        int j = 0;
        for (int i=0; i<n && j<n; i++, j++) {
            auxArr[j] = arr[i];
            if (arr[i] == 0 && j < n - 1) {
                auxArr[++j] = 0;
            }
        }
        for (int i=0; i<n; i++) arr[i] = auxArr[i];
    }
}
