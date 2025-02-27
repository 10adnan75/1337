class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = getMax(piles);
        int ans = hi;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            long time = 0L;

            for (int pile: piles) {
                time += (int) Math.ceil((double) pile / mid);
            }

            if (time <= h) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    public int getMax(int[] a) {
        int max = a[0];

        for (int i: a) {
            max = Math.max(i, max);
        }

        return max;
    }
}
