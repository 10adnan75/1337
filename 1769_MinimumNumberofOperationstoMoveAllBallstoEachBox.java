class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for (int i=0; i<ans.length; i++) {
            for (int j=i+1; j<ans.length; j++) {
                if (boxes.charAt(j) == '1') {
                    ans[i] += j-i;
                }
            }
        }
        for (int i=ans.length-1; i>=0; i--) {
            for (int j=i-1; j>=0; j--) {
                if (boxes.charAt(j) == '1') {
                    ans[i] += i-j;
                }
            }
        }
        return ans;
    }
}
