class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int a: arr) {
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        int c = 0;
        int[] aux = new int[map.size()];
        for (Map.Entry e: map.entrySet()) {
            aux[c++] = (int)e.getValue();
        }
        Arrays.sort(aux);
        c = 0;
        int ans = 0;
        for (int i=aux.length-1; i>=0; i--) {
            if (c+aux[i] >= arr.length/2) {
                return ans+1;
            }
            c += aux[i];
            ans++;
        }
        return ans;
    }
}
