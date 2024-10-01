class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            int key = ((i%k)+k)%k;
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        for (int i: arr) {
            int key = ((i%k)+k)%k;
            if (key == 0) {
                if (map.get(key)%2 != 0) {
                    return false;
                }
            } else if (!Objects.equals(map.get(key), map.get(k-key))) {
                return false;
            }
        }
        return true;
    }
}
