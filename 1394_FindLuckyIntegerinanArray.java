class Solution {
    public int findLucky(int[] arr) {
        int[] frequency = new int[501];
        for (int i : arr) {
            frequency[i]++;
        }
        for (int i=frequency.length-1; i>0; i--) {
            if (i == frequency[i]) {
                return i;
            }
        }
        return -1;
    }
}
