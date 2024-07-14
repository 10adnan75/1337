class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        char[] ans = new char[n];
        for (int i=0; i<n; i++) {
            ans[i] = s.charAt((i+k)%n);
        }
        return new String(ans);
    }
}
