// WA :(
class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int p = 0, i = 0, f = Integer.MAX_VALUE;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                f = Math.min(i, f);
                p++;
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();
        f = f == Integer.MAX_VALUE ? 0 : f;
        ans.append(s.substring(0, f));
        for (i=f; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (p == 1) {
                    ans.append(createString(st));
                }
                String temp = "";
                if (st.empty()) {
                    continue;
                }
                while (st.peek() != '(') {
                    temp += st.pop();
                }
                st.pop();
                p--;
                for (char ch: temp.toCharArray()) {
                    st.push(ch);
                }
            } else {
                st.push(c);
            }
        }
        String extra = "";
        while (!st.empty()) {
            char e = st.pop();
            extra = e == '(' ? extra : extra + e;
        }
        for (i=extra.length()-1; i>=0; i--) {
            ans.append(extra.charAt(i));
        }
        return ans.toString();
    }

    public String createString(Stack<Character> st) {
        String s = "";
        while (!st.empty()) {
            char e = st.pop();
            s = e == '(' ? s: s + e;
        }
        return s;
    }
}
