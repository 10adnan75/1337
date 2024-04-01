// 1 ms
class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        return strArr[strArr.length-1].length();
    }
}

// 0 ms
class Solution {
    public int lengthOfLastWord(String s) {
        int c = 0;
        boolean flag = false;
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) == ' ') {
                if (flag) {
                    break;
                }
                continue;
            }
            if (s.charAt(i) != ' ') {
                flag = true;
                c++;
            }
        }
        return c;
    }
}
