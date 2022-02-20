class Solution {
    public int numDecodings(String s) {
        int size = s.length();
        if (size == 0) {
            return 0;
        }
        int[] ways = new int[size+1];
        ways[0] = 1;
        int temp = Integer.valueOf(s.substring(0,1));
        if (temp > 0 && temp <= 9) {
            ways[1] = 1;
        }
        for (int i=2; i<=size; i++) {
            int temp1 = Integer.valueOf(s.substring(i-1, i));
            if (temp1 > 0 && temp1 <= 9) {
                ways[i] += ways[i-1];
            }
            int temp2 = Integer.valueOf(s.substring(i-2, i));
            if (temp2 >= 10 && temp2 <= 26) {
                ways[i] += ways[i-2];
            }
        }
        return ways[size];
    }
}
