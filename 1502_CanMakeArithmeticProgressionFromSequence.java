class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i=1; i<arr.length-1; i++) {
            if ((2 * arr[i]) - arr[i-1] != arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
