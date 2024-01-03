class Solution {
    public int getBeams(String bank) {
        int cnt = 0;
        for (char c: bank.toCharArray()) {
            if (c-'0' == 1) {
                cnt++;
            }
        }
        return cnt;
    }

    public int numberOfBeams(String[] bank) {
        int prev = 0, sum = 0;
        for (String b: bank) {
            int curr = getBeams(b);
            if (curr != 0) {
                sum += prev * curr;
                prev = curr;
            }
        }
        return sum;
    }
}
