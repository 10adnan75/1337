class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] lost = new int[100001];
        boolean[] played = new boolean[100001];
        for (int[] match: matches) {
            played[match[0]] = true;
            played[match[1]] = true;
            lost[match[1]]++;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> zero = new ArrayList<>(), one = new ArrayList<>();
        for (int i=0; i<lost.length; i++) {
            if (played[i]) {
                if (lost[i] == 0) {
                    zero.add(i);
                } else if (lost[i] == 1) {
                    one.add(i);
                }
            }
        }
        ans.add(zero); ans.add(one);
        return ans;
    }
}
