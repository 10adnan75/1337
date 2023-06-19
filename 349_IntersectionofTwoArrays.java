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
