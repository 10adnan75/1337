class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> l = new ArrayList<>();
        boolean f1 = false, f2 = false;
        for (String t: text.split(" ")) {
            if (f1 && f2) {
                l.add(t);
                f1 = false;
                f2 = false;
                if (t.equals(first)) {
                    f1 = true;
                }
                if (f1 && t.equals(second)) {
                    f2 = true;
                }
            } else if (f1) { 
                if (t.equals(second)) {
                    f2 = true;
                } else {
                    f1 = false;
                }
            } 
            if (t.equals(first)) {
                f1 = true;
            }
        }
        String[] ans = new String[l.size()];
        int i = 0;
        for (String s: l) {
            ans[i++] = s;
        }
        return ans;
    }
}
