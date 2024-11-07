class Solution {
    int[] bitset = new int[64];

    public int largestCombination(int[] candidates) {
        for (int i=0; i<candidates.length; i++) {
            updateBitset(candidates[i]);
        }
        int max = 0;
        for (int i=1; i<64; i++) {
            if (bitset[i] >= bitset[max]) {
                max = i;
            } 
        }
        return bitset[max];
    }

    public void updateBitset(int num) {
        int i = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                bitset[i]++;
            }
            num /= 2;
            i++;
        }
    }
}
