class Solution {
    int MOD = (int) 1e9 + 7;

    public int rev(int n) {
        StringBuilder sb = new StringBuilder(n + "");
        return Integer.parseInt((sb.reverse().toString()));
    }

    public int countNicePairs(int[] nums) {
        int[] aux = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        int c = 0;
        for (int i=0; i<nums.length; i++) {
            aux[i] = nums[i] - rev(nums[i]);
        }
        for (int a: aux) {
            c = (c + map.getOrDefault(a, 0)) % MOD;
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        return c;
    }
}
