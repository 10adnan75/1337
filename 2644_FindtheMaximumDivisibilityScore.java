class Solution {
    public int getDivisors(int[] nums, int d) {
        int c = 0;
        for (int num : nums) {
            if (num % d == 0) {
                c++;
            }
        }
        return c;
    }

    public int maxDivScore(int[] nums, int[] divisors) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int divisor : divisors) {
            if (!map.containsKey(divisor)) {
                map.put(divisor, getDivisors(nums, divisor));
            }
        }
        int max = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            int k = (int)entry.getKey();
            int v = (int)entry.getValue();
            if (v > max || (v == max && k < ans)) {
                ans = k;
                max = v;
            }
        }
        return ans;
    }
}
