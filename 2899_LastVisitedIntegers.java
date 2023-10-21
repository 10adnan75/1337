class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        int c = 0;
        for (String word: words) {
            if (word.equals("prev")) {
                c++;
            }
        }
        int[] numsRev = new int[words.size() - c];
        c = 0;
        for (String word: words) {
            if (!word.equals("prev")) {
                numsRev[c++] = Integer.valueOf(word);
            }
        }
        int prev = 0;
        for (String word: words) {
           if (word.equals("prev")) {
               prev++;
           } else {
               while (prev > 0) {
                   ans.add(numsRev[--c]);
               }
               prev = 0;
           }
        }
        return numsRev;
    }
}
