class Solution {
    public int maximumSwap(int num) {
        char[] digits = (num+"").toCharArray();
        int max = 0, n = digits.length;
        int[] prefix = new int[n], postfix = new int[n];

        postfix[n-1] = (int)digits[n-1]-'0';
        for (int i=n-2; i>=0; i--) {
            postfix[i] = Math.max(postfix[i+1], (int)digits[i]-'0');
        }

        prefix[0] = (int)digits[0]-'0';
        for (int i=1; i<n; i++) {
            prefix[i] = Math.min(prefix[i-1], (int)digits[i]-'0');
        }

        for (int i=0; i<n; i++) {
            if (prefix[i] < postfix[i]) {
                int j = upperBound(postfix, i, postfix[i]);
                return swap(digits, i, j);
            }
        }

        return num;
    }

    public int upperBound(int[] a, int j, int x) {
        for (int i=a.length-1; i>j; i--) {
            if (a[i] == x) {
                return i;
            }
        }
        return j;
    }

    public int swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return Integer.parseInt(new String(a));
    }
}
