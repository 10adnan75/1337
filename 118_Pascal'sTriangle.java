// My code
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l1 = new ArrayList<Integer>(){{add(1);}};
        ans.add(l1);
        if (numRows == 1) {
            return ans;
        }
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1); l2.add(1);
        ans.add(l2);
        if (numRows == 2) {
            return ans;
        }
        for (int i=3; i<=numRows; i++) {
            List<Integer> l = new ArrayList<>();
            int j = 0;
            while (j < i) {
                if (j == 0 || j == i-1) {
                    l.add(1);
                } else {
                    l.add(ans.get(i-2).get(j) + ans.get(i-2).get(j-1));
                }
                j++;
            }
            ans.add(l);
        }
        return ans;
    }
}

// O(n^2) - Runtime: 0 ms, Memory: 36.6 MB
class Solution {
    public List<List<Integer>> generate(int numRows) {
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
