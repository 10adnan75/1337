class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i=1; i<=rowIndex; i++) {
            ans.add((int)(((long)ans.get(ans.size()-1)*(rowIndex-i+1))/i));
        }
        return ans;
    }
}

// My code :)
class Solution {
    public List<Integer>[] ans = new ArrayList[34];

    public List<Integer> generateRow(int row) {
        List<Integer> l = new ArrayList<>();
        for (int i=0; i<=row; i++) {
            if (i==0 || i==row) {
                l.add(1);
            } else {
                l.add(ans[row-1].get(i) + ans[row-1].get(i-1));
            }
        }
        return l;
    }

    public List<Integer> getRow(int rowIndex) {
        for (int i=0; i<34; i++) {
            ans[i] = generateRow(i);
        }
        return ans[rowIndex];
    }
}
