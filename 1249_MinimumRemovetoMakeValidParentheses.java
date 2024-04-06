class Solution {
    public String minRemoveToMakeValid(String s) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            }
            if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    set.add(i);
                }
            }
        }
        while (!stack.isEmpty()) {
            set.add(stack.pop());
        }
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<s.length(); i++) {
            if (!set.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

// My code
class Solution {
    public String minRemoveToMakeValid(String s) {
        String ans = "";
        char[] ch = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    ch[i] = '$';
                }
            }
        }
        while (!stack.empty()) {
            ch[stack.pop()] = '$';
        }
        for (char c: ch) {
            if (c != '$') {
                ans += c;
            }
        }
        return ans;
    }
}
