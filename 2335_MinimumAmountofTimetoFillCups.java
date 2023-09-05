// Greedy approach
class Solution {
    public int fillCups(int[] amount) {
        int ans = 0;
        while (true) {
            Arrays.sort(amount);
            if (amount[2] == 0) {
                break;
            } else if (amount[1] == 0) {
                ans += amount[2];
                break;
            } else {
                ans++;
                amount[1]--;
                amount[2]--;
            }
        }
        return ans;
    }
}

// Simple math
class Solution {
    public int fillCups(int[] amount) {
        int sum = 0, mx = 0;
        for (int a : amount) {
            mx = Math.max(a, mx);
            sum += a;
        }
        return Math.max(mx, (sum + 1) / 2);
    }
}
