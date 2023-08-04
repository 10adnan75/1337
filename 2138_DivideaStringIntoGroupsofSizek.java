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
