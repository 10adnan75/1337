class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        int c = 0;
        for (String word: words) {
            if (word.equals("prev")) {
                c++;
            }
        }
        int[] numsRev = new int[words.size()-c];
        c = 0;
        for (String word: words) {
            if (!word.equals("prev")) {
                numsRev[c++] = Integer.valueOf(word);
            }
        }
        c = -1;
        int i = 0, prev = 0;
        while (i < words.size()) {
            if (words.get(i).equals("prev")) {
                if (c == -1) {
                    ans.add(c);
                    i++;
                    continue;
                }
                ans.add(numsRev[c--]);
                prev++;
            } else {
                c = prev == 0 ? c+1 : c+prev+1;
                prev = 0;
            }
            i++;
        }
        return ans;
    }
}
