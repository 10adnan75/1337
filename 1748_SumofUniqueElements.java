// Hash map - 1 ms
class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry e : map.entrySet()) {
            if ((int)e.getValue() == 1) {
                c += (int)e.getKey();
            }
        }
        return c;
    }
}

// Frequency counter - 0 ms
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        int c = 0;
        for (int i : nums) {
            freq[i]++;
        }
        for (int i=0; i<freq.length; i++) {
            if (freq[i] == 1) {
                c += i;
            }
        }
        return c;
    }
}
