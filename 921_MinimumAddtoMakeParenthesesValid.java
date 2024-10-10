class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char c: s.toCharArray()) {
            if (c == ')') {
                if (stack.empty()) {
                    count++;
                } else {
                    stack.pop();
                }
            } else {
                stack.push('(');
            }
        }
        return count + stack.size();
    }
}
