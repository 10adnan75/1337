class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i=0; i<groupSizes.length; i++) {
            int key = groupSizes[i];
            if (!map.containsKey(key)) {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(key, l);
            } else {
                List<Integer> l = map.get(key);
                l.add(i);
                map.put(key, l);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            int k = (int)entry.getKey();
            List<Integer> v = (List<Integer>)entry.getValue();
            if (k != v.size()) {
                int x = k;
                int i = 0;
                List<Integer> y = new ArrayList<>();
                while (i < v.size()) {
                    if (i == x) {
                        ans.add(y);
                        x += k;
                        y = new ArrayList<>();
                        y.add(v.get(i++));
                    } else {
                        y.add(v.get(i++));
                    }
                    if (i == v.size()-1) {
                        ans.add(y);
                    }
                }
            } else {
                ans.add(v);
            }
        }
        return ans;
    }
}
