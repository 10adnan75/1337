class Solution {
    public String decToBin(int n, int len) {
        StringBuilder ans = new StringBuilder();
        while (n != 0) {
            ans.append(n%2);
            n /= 2;
        }
        while (ans.length() < len) {
            ans.append('0');
        }
        return ans.reverse().toString();
    }

    public int convertToDec(String s) {
        int p = 0, n = 0;
        for (int i=s.length()-1; i>=0; i--) {
            n += Math.pow(2, p++) * (s.charAt(i)-'0');
        }
        return n;
    }

    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        int[] base10 = new int[n];
        for (int i=0; i<n; i++) {
            base10[i] = convertToDec(nums[i]);
        }
        Arrays.sort(base10);
        for (int i=0; i<17; i++) {
            if (i >= n || i != base10[i]) {
                return decToBin(i, n);
            }
        }
        return "";
    }
}
