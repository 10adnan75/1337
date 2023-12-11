// 2 ms
class Solution {
    public int findSpecialInteger(int[] arr) {
        int[] freq = new int[100001];
        for (int i : arr) {
            freq[i]++;
        }
        int ans = 0;
        double n = arr.length * 0.25;
        for (int i=0; i<freq.length; i++) {
            if (freq[i] > n) {
                return i;
            }
        }
        return -1;
    }
}

// 3 ms
class Solution {
    public int findSpecialInteger(int[] arr) {
        int[] freq = new int[100001];
        for (int i : arr) {
            freq[i]++;
        }
        int ans = 0;
        double n = arr.length * 0.25;
        for (int i=0; i<freq.length; i++) {
            if (freq[i] > n) {
                ans = i;
            }
        }
        return ans;
    }
}
