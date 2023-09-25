class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            Set<Integer> set = map.containsKey(log[0]) ? map.get(log[0]) : new HashSet<>();
            set.add(log[1]);
            map.put(log[0], set);
        }
        for (Map.Entry entry : map.entrySet()) {
            Set<Integer> set = (Set<Integer>)entry.getValue();
            ans[set.size()-1]++;
        }
        return ans;
    }
}
