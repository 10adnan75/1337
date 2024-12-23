class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length, i = 1;

        if (length == 1 && flowerbed[0] == 0) {
            return true;
        }

        if (length == 2) {
            int countOfFlowers = 0;

            if (n > 1) {
                return false;
            }

            for (int flower: flowerbed) {
                if (flower == 0) {
                    countOfFlowers++;
                }
            }

            return n == 0 || countOfFlowers == length;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
            i++;
        }

        while (i < length - 1) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
                i++;
            }
            i++;
        }

        if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
            n--;
        }

        return n <= 0;
    }
}
