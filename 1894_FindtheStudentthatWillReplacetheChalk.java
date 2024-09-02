class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int i = 0;
        while (chalk[i] <= k) {
            k -= chalk[i];
            i++;
            if (i == chalk.length) {
                i = 0;
            }
        }
        return i;
    }
}
