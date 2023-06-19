// Runtime: 5 ms, Beats 20.78%
// Memory: 43.7 MB, Beats 27.36%
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for (int i : nums1) {
            map.put(i, 1 + map.getOrDefault(i, 0));
        }
        for (int i : nums2) {
            if (map.containsKey(i)) {
                int val = map.get(i);
                if (val != -1) {
                    ans.add(i);
                    map.put(i, -1);
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}

// Runtime: 3 ms, Beats 49.22%
// Memory: 42.5 MB, Beats 88.52%
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] vals = new int[1001];
        List<Integer> ans = new ArrayList<>();
        for (int i : nums1) {
            vals[i]++;
        }
        for (int i : nums2) {
            if (vals[i] > 0) {
                ans.add(i);
                vals[i] = 0;
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
