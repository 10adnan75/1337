class Solution {
    public boolean checkValidString(String s) {
        int min = 0, max = 0;
        for (char c: s.toCharArray()) {
            if (c == '(') {
                min++;
                max++;
            } else if (c == ')') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }
            if (max < 0) {
                return false;
            }
            if (min < 0) {
                min = 0;
            }
        }
        return min == 0;
    }
}

// my code: passed 70/83 testcases (need to work on this)
class Solution {
    public boolean checkValidString(String s) {
        int c = 0, k = 0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (c > 0 && k == 0) {
                    c = 0;
                }
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                k++;
                if (stack.empty()) {
                    if (c == 0) {
                        return false;
                    } else {
                        c--;
                        continue;
                    }
                }
                stack.pop();
            } else {
                c++;
            }
        }
        return stack.empty() ? true : c - stack.size() >= 0;
    }
}
