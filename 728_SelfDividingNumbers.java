class Solution {
    public boolean checkNum(int num) {
        int n = num;
        while (num > 0) {
            int d = num % 10;
            if ((d == 0) || (n % d != 0)) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i=left; i<=right; i++) {
            if (checkNum(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
