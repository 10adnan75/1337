// My code
class Solution {
    public int pivotInteger(int n) {
        int[] left = new int[n+1];
        int[] right = new int[n+1];
        left[1] = 1;
        right[n] = n;
        for (int i=2, j=n-1; i<=n && j>=1; i++, j--) {
            left[i] = i + left[i-1];
            right[j] = j + right[j+1];
        }
        for (int i=1; i<=n; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }
        return -1;
    }
}

// Math
class Solution {
    public int pivotInteger(int n) {
        int sum = (n * n + n) / 2;
        int ans = (int) Math.sqrt(sum);
        return sum == ans * ans ? ans : -1;
    }
}

// Naive
class Solution {
    public int pivotInteger(int n) {
        for (int i=1; i<=n; i++) {
            if (findPivot(i, n)) {
                return i;
            }
        }
        return -1;
    }

    public boolean findPivot(int x, int n) {
        int sum = 0;
        for (int i=1; i<=x; i++) {
            sum += i;
        }
        for (int i=x; i<=n; i++) {
            sum -= i;
        }
        return sum == 0;
    }
}
