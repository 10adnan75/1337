class Solution {
    public List<Integer> getIndices(String s, char c) {
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
                ans.add(i);
            }
        }
        return ans;
    }

    public int[] shortestToChar(String s, char c) {
        List<Integer> indicesOfC = getIndices(s, c);
        int[] ans = new int[s.length()];
        for (int i=0; i<ans.length; i++) {
            int shortest = Integer.MAX_VALUE;
            for (int index : indicesOfC) {
                shortest = Math.min(shortest, Math.abs(index - i));
            }
            ans[i] = shortest;
        }
        return ans;
    }
}
