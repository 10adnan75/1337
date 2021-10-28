class Solution {
    public List<Integer> partitionLabels(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        List<Integer> ans = new ArrayList<>();
        int[] map = new int[26];
        for (int i=0; i<s.length(); i++) {
            map[s.charAt(i)-'a'] = i;
        }
        int last = 0, first = 0;
        for (int i=0; i<s.length(); i++) {
            last = Math.max(last, map[s.charAt(i)-'a']);
            if (last == i) {
                ans.add(last-first+1);
                first = last + 1;
            }
        }
        return ans;
    }
}
