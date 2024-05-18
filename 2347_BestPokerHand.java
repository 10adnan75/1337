class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int[] freq = new int[14];
        for (int r: ranks) {
            freq[r]++;
        }
        Arrays.sort(suits);
        if (suits[0] == suits[4]) {
            return "Flush";
        } else if (check(freq, true)) {
            return "Three of a Kind";
        } else if (check(freq, false)) {
            return "Pair";
        }
        return "High Card";
    }

    public boolean check(int[] freq, boolean flag) {
        for (int f: freq) {
            if (flag && f >= 3) {
                return true;
            } else if (!flag && f == 2) {
                return true;
            }
        }
        return false;
    }
}
