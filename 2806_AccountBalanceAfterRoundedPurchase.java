class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int n = purchaseAmount;
        int plus = 0, minus = 0;
        while (n < 101) {
            if (n % 10 == 0) {
                break;
            }
            plus++;
            n++;
        }
        while (purchaseAmount > 0) {
            if (purchaseAmount % 10 == 0) {
                break;
            }
            minus++;
            purchaseAmount--;
        }
        if (plus == minus) {
          return Math.min(100-n, 100-purchaseAmount);
        }
        return plus < minus ? 100-n : 100-purchaseAmount;
    }
}
