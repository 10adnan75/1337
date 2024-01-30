class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String token: tokens) {
            if (isOperator(token)) {
                s.push(eval(s.pop(), s.pop(), token.charAt(0)));
            } else {
                s.push(Integer.valueOf(token));
            }
        }
        return s.pop();
    }

    public int eval(int two, int one, char op) {
        switch(op) {
            case '+': return one + two;
            case '-': return one - two;
            case '*': return one * two;
            case '/': return one / two;
        }
        return 0;
    }

    public boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
