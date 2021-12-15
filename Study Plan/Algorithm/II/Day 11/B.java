public class Solution {
    List<String> res = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        generate("", n, n);    
        return res;
    }

    private void generate(String s, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(s);
        }
        if(left < 0 || right < 0 || left > right ) {
            return ;
        }
        generate(s+'(', left-1, right);
        generate(s+')', left, right-1);
    }
}
