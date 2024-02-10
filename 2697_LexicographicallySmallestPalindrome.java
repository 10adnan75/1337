class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i=0; i<n/2; i++) {
            char one = chars[i], two = chars[n-i-1];
            chars[i] = one < two ? one : chars[n-i-1];
            chars[n-i-1] = one > two ? two : chars[i];
        }
        return new String(chars);
    }
}
