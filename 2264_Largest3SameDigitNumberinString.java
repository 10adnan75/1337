class Solution {
    public String get(int n) {
        return n == 0 ? "000" : n == 1 ? "111" : n == 2 ? "222" : n == 3 ? "333" : n == 4 ? "444" : n == 5 ? "555" : n == 6 ? "666" : n == 7 ? "777" : n == 8 ? "888" : "999";
    }

    public int check(String num) {
        if (num.charAt(0) != num.charAt(1) || num.charAt(1) != num.charAt(2)) {
            return Integer.MIN_VALUE;
        }
        return Integer.parseInt(num.charAt(0) + "");
    }

    public String largestGoodInteger(String num) {
        int ans = Integer.MIN_VALUE;
        for (int i=0; i<=num.length()-3; i++) {
            ans = Math.max(ans, check(num.substring(i, i+3)));
        }
        return ans == Integer.MIN_VALUE ? "" : get(ans);
    }
}
