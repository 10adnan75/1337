// 7 ms
class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        boolean flag = false;
        while (i < s.length()) {
            int j = k;
            String st = "";
            while (j-- > 0) {
                if (i == s.length() - 1) {
                    st += s.charAt(i++) + "";
                    flag = true;
                    break;
                }
                st += s.charAt(i++) + "";
            }
            if (flag) {
                while (j-- > 0) {
                    st += fill + "";
                }
            }
            ans.add(st);
        }
        String[] groups = new String[ans.size()];
        for (i=0; i<ans.size(); i++) {
            groups[i] = ans.get(i);
        }
        return groups;
    }
}

// 8 ms
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = 0;
        if (s.length() % k == 0) {
            size = s.length() / k;
        } else {
            size = s.length() / k + 1;
        }
        String[] ans = new String[size];
        int j = 0;
        for (int i=0; i<size; i++) {
            boolean f = false;
            String sb = "";
            int idx = 0;
            for (idx=k; idx>0; idx--) {
                if (j == s.length() - 1) {
                    f = !f;
                    sb += s.charAt(j++) + "";
                    break;
                }
                sb += s.charAt(j++) + "";
            }
            if (f) {
                while (idx-- > 1) {
                    sb += fill;
                }
            }
            ans[i] = sb;
        }
        return ans;
    }
}
