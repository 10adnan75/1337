class Solution {
    public int getBits(int n) {
        int c = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                c++;
            }
            n /= 2;
        }
        return c;
    }

    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int a: arr) {
            int n = getBits(a);
            if (!map.containsKey(n)) {
                List<Integer> l = new ArrayList<>() {{ add(a); }};
                map.put(n, l);
            } else {
                List<Integer> l = map.get(n);
                l.add(a);
                map.put(n, l);
            }
        }
        int idx = 0;
        for (Map.Entry e: map.entrySet()) {
            List<Integer> list = (List<Integer>)e.getValue();
            Collections.sort(list);
            for (int l: list) {
                arr[idx++] = l;
            }
        }
        return arr;
    }
}
