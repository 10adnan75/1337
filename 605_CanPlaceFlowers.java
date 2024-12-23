// Masterpiece of a code written by me :)
// IN
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

// Need to improve!
// US
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
