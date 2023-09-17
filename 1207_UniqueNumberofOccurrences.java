// 6 ms
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] freq = new int[2001];
        for (int i : arr) {
            freq[i+1000]++;
        }
        for (int i=0; i<freq.length; i++) {
            if (map.containsValue(freq[i])) {
                return false;
            }
            if (freq[i] != 0) {
                map.put(i-1000, freq[i]);
            }
        }
        return true;
    }
}

// 1 ms
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean[] unique = new boolean[arr.length+1];
        int[] freq = new int[2001];
        for (int i : arr) {
            freq[i+1000]++;
        }
        for (int i=0; i<freq.length; i++) {
            if (freq[i] != 0) {
                if (unique[freq[i]]) {
                    return false;
                }
                unique[freq[i]] = true;
            }
        }
        return true;
    }
}
