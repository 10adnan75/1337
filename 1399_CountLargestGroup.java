class Solution {
    public int getSum(int n) {
        String s = n + "";
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            sum += (int)s.charAt(i)-'0';
        }
        return sum;
    }

    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=1; i<=n; i++) {
            int key = getSum(i);
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        int maxSize = 0;
        for (Map.Entry entry : map.entrySet()) {
            maxSize = Math.max(maxSize, (int)entry.getValue());
        }
        int c = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (maxSize == (int)entry.getValue()) {
                c++;
            }
        }
        return c;
    }
}
