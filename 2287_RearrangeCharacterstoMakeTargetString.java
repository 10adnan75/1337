class Solution {
    public int[] makeCharArray(String word) {
        int[] ans = new int[26];
        for (int i=0; i<word.length(); i++) {
            ans[word.charAt(i)-'a']++;
        }
        return ans;
    }

    public int rearrangeCharacters(String s, String target) {
        int ans = Integer.MAX_VALUE;
        int[] chars = makeCharArray(s);
        int[] temps = makeCharArray(target);
        for (int i=0; i<target.length(); i++) {
            int x = chars[target.charAt(i)-'a'];
            int y = temps[target.charAt(i)-'a'];
            if (x == 0) {
                return 0;
            }
            ans = Math.min(ans, x/y);
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
