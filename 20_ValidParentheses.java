class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(c==')' && top!='(') return false; 
                if(c=='}' && top!='{') return false;
                if(c==']' && top!='[') return false;
            }
        }
        return stack.isEmpty();
    }
}

// My code: FEB 25, 2026, 5:20 PM, US
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (isOpenBracket(c)) {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                
                char popped = stack.pop();
                if (popped == '(') {
                    if (c != ')') {
                        return false;
                    }
                } else if (popped == '{') {
                    if (c != '}') {
                        return false;
                    }
                } else {
                    if (c != ']') {
                        return false;
                    }
                }
            }
        }

        return stack.empty();
    }

    public boolean isOpenBracket(char c) {
        return c == '[' || c == '{' || c == '(';
    }
}
