class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        char[] Sarray = s.toCharArray();
        for (int i=0; i<Sarray.length; i++) { 
            if (Sarray[i] == '#') { 
                if (stack.size() > 0) {
                    stack.pop();
                }                
            } else {
                stack.push(Sarray[i]);
            }
        }
        String first = String.valueOf(stack);
        stack.clear();
        char[] Tarray = t.toCharArray();
        for (int i=0; i<Tarray.length; i++) { 
            if (Tarray[i] == '#') { 
                if (stack.size() > 0) {
                    stack.pop();
                }
            } else {
                stack.push(Tarray[i]);
            }
        }
        String second = String.valueOf(stack);
        return first.equals(second);
    }
}

// My code
class Solution {
    public String helper(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (st.isEmpty() && c == '#') {
                continue;
            } else if (c == '#') {
                st.pop();
            } else {
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }

    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }
}
