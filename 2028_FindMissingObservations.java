class Solution {
    private int[] missing;

    public int[] missingRolls(int[] rolls, int mean, int n) {
        this.missing = new int[n];
        int x = getMissingNums(((rolls.length+n)*mean)-getSum(rolls), n);
        return x == -1 ? new int[] {} : this.missing;
    }

    public int getMissingNums(int sum, int n) {
        if (n*6 < sum || sum < n) {
            return -1;
        }
        int i = 0, x = sum / n, k = sum % n;
        while (i < n) {
            this.missing[i++] = x;
        }
        while (k-- > 0) {
            this.missing[--i]++;
        }
        return 0;
    }

    public int getSum(int[] a) {
        int sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
