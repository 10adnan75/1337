class Solution {
    private int[] ans;

    public int[] decrypt(int[] code, int k) {
        ans = new int[code.length];
        if (k < 0) {
            k *= -1;
            negative(code, k);
        } else if (k > 0) {
            positive(code, k);
        }
        return ans;
    }

    public void positive(int[] a, int k) {
        for (int i=0; i<ans.length; i++) {
            int sum = 0, j = i+1, d = k;
            while (d-- > 0) {
                sum += a[j++%ans.length];
            }
            ans[i] = sum;
        }
    }

    public void negative(int[] a, int k) {
        for (int i=0; i<ans.length; i++) {
            int sum = 0, j = i-1, d = k;
            while (d-- > 0) {
                if (j < 0) {
                    j = ans.length-1;
                }
                sum += a[j--%ans.length];
            }
            ans[i] = sum;
        }
    }
}
