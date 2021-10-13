class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        // O(n^2) - Runtime: 0 ms, Memory: 36.6 MB
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) {
            return ans;
        }
        for (int i=0; i<numRows; i++) {
            List<Integer> thisRow = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j == 0) {
                    thisRow.add(1);
                } else if (j < i) {
                    int thisNum = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    thisRow.add(thisNum);
                } else {
                    thisRow.add(1);
                }
            }
            ans.add(thisRow);
        }
        return ans;
    }
}
