class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] cash = new int[2];
        if (bills[0] != 5) {
            return false;
        }
        for (int bill: bills) {
            if (bill == 20) {
                if (cash[1] < 1 && cash[0] < 3) {
                    return false;
                }
                if (cash[0] < 1) {
                    return false;
                }
                if (cash[1] > 0) {
                    cash[1]--;
                    cash[0]--;
                } else {
                    cash[0] -= 3;
                }
            } else if (bill == 10) {
                if (cash[0] < 1) {
                    return false;
                }
                cash[0]--;
                cash[1]++;
            } else {
                cash[0]++;
            }
        }
        return true;
    }
}
