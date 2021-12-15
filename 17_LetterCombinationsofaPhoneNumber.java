public class Solution {
    List<String> res = new ArrayList<>();
    String[] dict = new String[] { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    public List<String> letterCombinations(String digits) {
        combination(digits, 0, "");
        return res;
    }

    private void combination(String digits, int k, String current) {
        if (k == digits.length()) {
            if (!current.isEmpty()) {
                res.add(current);
            }
            return;
        }
        String s = dict[digits.charAt(k)-'0'];
        for (Character c : s.toCharArray()) {
            combination(digits, k+1, current+c);
        }
    }
}
