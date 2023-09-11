class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for (int a : arr1) {
            freq[a]++;
        }
        int i = 0;
        for (int a : arr2) {
            while (freq[a]-- > 0) {
                arr1[i++] = a;
            }
        }
        for (int a=0; a<freq.length; a++) {
            while (freq[a]-- > 0) {
                arr1[i++] = a;
            }
        }
        return arr1;
    }
}
