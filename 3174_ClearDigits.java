class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (!(c >= '0' && c <= '9')) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        String ans = "";
        for (char c: stack) {
            ans += c;
        }
        return ans;
    }
}
