class Solution {
    public int distributeCandies(int[] candyType) {
        int[] freq = new int[200001];
        for (int candy: candyType) {
            freq[candy+100000]++;
        }
        int ans = 0;
        for (int f: freq) {
            if (ans < candyType.length/2 && f > 0) {
                ans++;
            }
        }
        return ans;
    }
}
