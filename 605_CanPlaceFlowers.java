class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countZero = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if (left && right) {
                    flowerbed[i] = 1;
                    countZero++;
                    if (n <= countZero) {
                        return true;
                    }
                    i += 2;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return n <= countZero;
    }
}
