// Idk why this solution fails :(
class Solution {
    public String reverse(String s) {
        String ans = "";
        for (int i=s.length()-1; i>=0; i--) {
            ans += s.charAt(i) + "";
        }
        return ans;
    }

    public String reverseStr(String s, int k) {
        if (s.length() <= k) {
            return reverse(s);
        }
        if (k == 1) {
            return s;
        }
        String ans = "";
        int rem = s.length() - s.length() % k;
        String parity = s.substring(rem, s.length());
        String mutable = s.substring(0, rem);
        // System.out.println("len: " + s.length() + ", rem: " + rem + "\nmutable: " + mutable + "\nparity: " + parity);
        // System.out.println("len(mutable): " + mutable.length() + ", len(parity): " + parity.length());
        for (int i=0; i<mutable.length(); i+=2*k) {
            ans += reverse(mutable.substring(i, i + k));
            if (i + 2 * k <= mutable.length()) {
                ans += mutable.substring(i + k, i + 2 * k);
            }
        }
        ans += parity;
        return ans;
    }
}

// Accepted solution
class Solution {
    public String reverseStr(String s, int k) {
        char[] ans = s.toCharArray();
        for (int idx=0; idx<ans.length; idx+=2*k) {
            int i = idx, j = Math.min(idx + k - 1, ans.length - 1);
            while (i < j) {
                char temp = ans[i];
                ans[i++] = ans[j];
                ans[j--] = temp;
            }
        }
        return new String(ans);
    }
}
