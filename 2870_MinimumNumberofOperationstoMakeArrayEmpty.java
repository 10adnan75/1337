class Solution {
    public int minOperations(int[] nums) {
        int operations = 0, max = 0;
        int[] freq = new int[1000001];
        for (int num: nums) {
            freq[num]++;
            max = Math.max(max, num);
        }
        for (int i=1; i<=max; i++) {
            int c = freq[i];
            if (c != 0) {
                if (c == 1) {
                    return -1;
                } else if (c%3 == 1 || c%3 == 2) {
                    operations += c/3+1;
                } else if (c%3 == 0) {
                    operations += c/3;
                } else {
                    operations += c/2;
                }
            }
        }
        return operations;
    }
}
