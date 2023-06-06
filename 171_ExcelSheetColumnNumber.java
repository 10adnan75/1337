class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        int idx = columnTitle.length() - 1;
        for (char i : columnTitle.toCharArray()) {
            num += Math.pow(26, idx--) * (Integer.valueOf(i) - 64);
        }
        return num;
    }
}
