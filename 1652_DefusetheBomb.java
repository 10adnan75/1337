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

// November 17, 2024, USA, 7:30 PM (Pacific)
// 0 ms 😎
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] decrypted = new int[n];

        if (k == 0) {
            return decrypted;
        }
        
        for (int i=0; i<n; i++) {
            decrypted[i] = cipher(code, i, k);
        }

        return decrypted;
    }

    public int cipher(int[] arr, int start, int diff) {
        int sum = 0, k = Math.abs(diff), n = arr.length;
        start = diff > 0 ? start+1 < n ? start+1 : 0 : start-1 >= 0 ? start-1 : n-1;

        while (k-- > 0) {
            sum += arr[start];
            start = diff > 0 ? start+1 < n ? start+1 : 0 : start-1 >= 0 ? start-1 : n-1;
        }
        
        return sum;
    }
}
