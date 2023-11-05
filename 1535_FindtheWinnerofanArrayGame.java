// TLE
class Solution {
    public int getMax(int[] arr) {
        int max = 0;
        for (int a: arr) {
            max = Math.max(max, a);
        }
        return max;
    }

    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        if (k >= n) {
            return getMax(arr);
        }
        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        while (l < n) {
            int max = Math.max(arr[0], arr[1]);
            int min = Math.min(arr[0], arr[1]);
            map.put(max, map.getOrDefault(max, 0)+1);
            if (map.get(max) == k) {
                return max;
            }
            arr[0] = max;
            for (int i=2; i<n; i++) {
                arr[i-1] = arr[i];
            }
            arr[n-1] = min;
        }
        return -1;
    }
}
