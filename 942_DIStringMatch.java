class Solution {
    public int[] diStringMatch(String s) {
        int idx = 0, i = 0, d = s.length();
        int[] ans = new int[d+1];
        for (idx=0; idx<s.length(); idx++) {
            ans[idx] = (s.charAt(idx) == 'I') ? i++ : d--;
        }
        ans[idx] = ans[idx-1] == 'I' ? i++ : d--;
        return ans;
    }
}
