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
