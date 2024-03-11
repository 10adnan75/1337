class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
        }
        for (int i=0; i<order.length(); i++) {
            while (freq[order.charAt(i)-'a']-- > 0) {
                sb.append(order.charAt(i));
            }
        }
        for (int i=0; i<freq.length; i++) {
            while (freq[i]-- > 0) {
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}
