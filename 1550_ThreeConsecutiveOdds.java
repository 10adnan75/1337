class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c = 0;
        for (int a : arr) {
            if ((a & 1) == 1) {
                c++;
            } else {
                c = 0;
            }
            if (c == 3) {
                return true;
            }
        }
        return false;
    }
}

// July 12, 2024
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i=2; i<arr.length; i++) {
            if (check(arr[i-2]) && check(arr[i-1]) && check(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean check(int n) {
        return (n&1) == 1;
    }
}
