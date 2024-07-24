class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[] aux = new int[n];
        for (int i=0; i<n; i++) {
            aux[i] = map(nums[i], mapping);
        }
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int i=0; i<n; i++) {
            int k = aux[i];
            List<Integer> v = new ArrayList<>();
            if (m.containsKey(k)) {
                v = m.get(k);
            }
            v.add(nums[i]);
            m.put(k, v);
        }
        Arrays.sort(aux);
        for (int i=0, j=0; i<n; i++) {
            List<Integer> l = m.get(aux[i]);
            int size = l.size(), k = 0;;
            while (size-- > 0) {
                nums[j++] = l.get(k++);
            }
            l.clear();
        }
        return nums;
    }

    public int map(int num, int[] mapping) {
        StringBuilder sb = new StringBuilder();
        for (char c: (num+"").toCharArray()) {
            sb.append(mapping[c-'0']);
        }
        return Integer.valueOf(sb.toString());
    }
}
