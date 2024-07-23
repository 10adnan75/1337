class Solution {
    // public <Key extends Comparable> Map<Key, Value> sortByKeysDesc(Map<Key, Value> map) {
    //     Map<Key, Value> treeMap = new TreeMap<>(new Comparator<Key>() {
    //         @override
    //         public int compare(Key a, Key b) {
    //             return b.compareTo(a);
    //         }
    //     });
    //     treeMap.putAll(map);
    //     return treeMap;
    // }

    public Map<Integer, Integer> sortByKeysDesc(Map<Integer, Integer> map) {
        Map<Integer, Integer> treeMap = new TreeMap<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });
        treeMap.putAll(map);
        return treeMap;
    }

    public Map<Integer, Integer> sortByValues(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });
        Map<Integer, Integer> ans = new HashMap<>();
        for (Map.Entry entry : list) {
            ans.put((int)entry.getKey(), (int)entry.getValue());
        }
        return ans;
    }

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        map = sortByKeysDesc(map);
        Map<Integer, Integer> hMap = sortByValues(map);
        int[] ans = new int[nums.length];
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key-> " + entry.getKey() + ", Value-> " + entry.getValue());
        }
        for (Map.Entry entry : hMap.entrySet()) {
            System.out.println("Key-> " + entry.getKey() + ", Value-> " + entry.getValue());
        }
        return ans;
    }
}

// Finally solved this question on July 24, 2024.
class Solution {
    public int[] frequencySort(int[] nums) {
        int[] freq = new int[201];
        Map<Integer, List<Integer>> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i: nums) {
            freq[i+100]++;
        }
        for (int i=0; i<freq.length; i++) {
            if (freq[i] != 0) {
                int key = freq[i];
                List<Integer> l = new ArrayList<>();
                if (map.containsKey(key)) {
                    l = map.get(key);
                }
                l.add(i-100);
                map.put(key, l);
                if (!pq.contains(key)) {
                    pq.offer(key);
                }
            }
        }
        int id = 0;
        while (!pq.isEmpty()) {
            int c = pq.poll();
            List<Integer> l = map.get(c);
            for (int i=l.size()-1; i>=0; i--) {
                int ct = c;
                while (ct-- > 0) {
                    nums[id++] = l.get(i);
                }
            }
        }
        return nums;
    }
}
