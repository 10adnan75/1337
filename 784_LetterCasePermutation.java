class Solution {
    
    private void backTrack(List<String> ans, int idx, char[] str) {
        if (idx == str.length) {
            ans.add(new String(str));
        } else {
            if (Character.isLetter(str[idx])) {
                str[idx] = Character.toUpperCase(str[idx]);
                backTrack(ans, idx+1, str);
                str[idx] = Character.toLowerCase(str[idx]);
            }
            backTrack(ans, idx+1, str);
        }
    }
    
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        backTrack(ans, 0, s.toCharArray());
        return ans;
    }
}
