// HashMap: 7 ms
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] num: nums) {
            for (int n: num) {
                map.put(n, map.getOrDefault(n, 0)+1);
            }
        }
        for (Map.Entry e: map.entrySet()) {
            if ((int)e.getValue() == nums.length) {
                ans.add((int)e.getKey());
            }
        }
        return ans;
    }
}

// Array: 3 ms
class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[1001];
        for (int[] num: nums) {
            for (int n: num) {
                freq[n]++;
            }
        }
        int i = 0;
        for (int n: freq) {
            if (n == nums.length) {
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
}
