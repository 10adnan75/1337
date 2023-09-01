// Array
// Runtime: 25 ms, Beats 16.37%
// Memory: 43.8 MB, Beats 7.21%
class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        while (k-- > 0) {
            Arrays.sort(gifts);
            gifts[gifts.length-1] = (int)Math.floor(Math.sqrt(gifts[gifts.length-1]));
        }
        for (int gift : gifts) {
            ans += gift;
        }
        return ans;
    }
}

// Priority Queue
