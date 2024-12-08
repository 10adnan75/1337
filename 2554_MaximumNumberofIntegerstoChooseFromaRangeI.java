class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int i: banned) {
            set.add(i);
        }
        int sum = 0, c = 0;
        for (int i=1; i<=n; i++) {
            if (!set.contains(i)) {
                if (sum+i > maxSum) {
                    break;
                }
                sum += i;
                c++;
            }
        }
        return c;
    }
}
